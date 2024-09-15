package br.com.psiplanner.controller;

import br.com.psiplanner.domain.auth.Login;
import br.com.psiplanner.domain.auth.Session;
import br.com.psiplanner.service.AuthService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

    private final AuthService authService;

    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @PostMapping("/login")
    public Session login(@RequestBody Login login) {
        return authService.login(login);
    }
}
