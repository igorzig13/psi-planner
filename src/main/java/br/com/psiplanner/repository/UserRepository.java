package br.com.psiplanner.repository;

import br.com.psiplanner.domain.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
