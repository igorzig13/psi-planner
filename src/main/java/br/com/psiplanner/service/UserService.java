package br.com.psiplanner.service;

import br.com.psiplanner.domain.auth.Role;
import br.com.psiplanner.domain.person.Person;
import br.com.psiplanner.domain.user.User;
import br.com.psiplanner.repository.RoleRepository;
import br.com.psiplanner.repository.UserRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService implements UserDetailsService {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final PersonService personService;
    private final RoleRepository roleRepository;

    public UserService(UserRepository userRepository, PasswordEncoder passwordEncoder, PersonService personService, RoleRepository roleRepository) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
        this.personService = personService;
        this.roleRepository = roleRepository;
    }

    public void createUser(User user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        Role role = roleRepository.findByName("ROLE_USER");
        if (role != null)
            user.getAuthorities().add(role);

        if (user.getPerson() != null) {
            Person person = user.getPerson();
            personService.save(person);
            user.setPerson(person);
        } else {
            throw new IllegalArgumentException("User must have a valid person");
        }
        userRepository.save(user);
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByUsername(username);

        if (user == null) {
            throw new UsernameNotFoundException(username);
        }

        return user;
    }
}
