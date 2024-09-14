package br.com.psiplanner.config.security;

import br.com.psiplanner.domain.auth.Role;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class JWTObject {
    private String subject;
    private Date issuedAt;
    private Date expiration;
    private List<Role> roles;



    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Date getIssuedAt() {
        return issuedAt;
    }

    public void setIssuedAt(Date issuedAt) {
        this.issuedAt = issuedAt;
    }

    public Date getExpiration() {
        return expiration;
    }

    public void setExpiration(Date expiration) {
        this.expiration = expiration;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    public List<String> getRoleNames() {
        return this.getRoles().stream().map(Role::getAuthority).collect(Collectors.toList());
    }
}
