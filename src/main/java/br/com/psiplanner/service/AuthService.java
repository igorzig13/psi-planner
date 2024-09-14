package br.com.psiplanner.service;

import br.com.psiplanner.config.security.JWTCreator;
import br.com.psiplanner.config.security.JWTObject;
import br.com.psiplanner.config.security.SecurityConstants;
import br.com.psiplanner.domain.auth.Login;
import br.com.psiplanner.domain.auth.Session;
import br.com.psiplanner.domain.user.User;
import br.com.psiplanner.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;

@Service
public class AuthService {

    private final PasswordEncoder passwordEncoder;
    private final UserRepository userRepository;
    private final SecurityConstants securityConstants;

    public AuthService(PasswordEncoder passwordEncoder, UserRepository userRepository, SecurityConstants securityConstants) {
        this.passwordEncoder = passwordEncoder;
        this.userRepository = userRepository;
        this.securityConstants = securityConstants;
    }

    public Session login (Login login) {
        User user = userRepository.findByUsername(login.getUsername());
        if (user == null) {
            throw new UsernameNotFoundException(login.getUsername());
        }
        if (!passwordEncoder.matches(login.getPassword(), user.getPassword())) {
            throw new BadCredentialsException(login.getUsername());
        }

        Session session = new Session();
        session.setLogin(user.getUsername());

        JWTObject jwtObject = new JWTObject();
        jwtObject.setIssuedAt(new Date(System.currentTimeMillis()));
        jwtObject.setExpiration(new Date(System.currentTimeMillis() + SecurityConstants.getExpiration()));
        jwtObject.setSubject(user.getUsername());
        jwtObject.setRoles(new ArrayList<>(user.getAuthorities()));
        session.setToken(JWTCreator.create(SecurityConstants.getPrefix(), SecurityConstants.getKey(), jwtObject));
        return session;
    }
}
