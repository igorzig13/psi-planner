package br.com.psiplanner.config.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SecurityConstants {

    private static SecurityProperties securityProperties;

    @Autowired
    public void setSecurityProperties(SecurityProperties securityProperties) {
        SecurityConstants.securityProperties = securityProperties;
    }

    public static String getPrefix() {
        return securityProperties.getPrefix();
    }

    public static String getKey() {
        return securityProperties.getKey();
    }

    public static Long getExpiration() {
        return securityProperties.getExpiration();
    }
}
