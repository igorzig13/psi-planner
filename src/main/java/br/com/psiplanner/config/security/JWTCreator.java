package br.com.psiplanner.config.security;

import br.com.psiplanner.domain.auth.Role;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import java.util.List;

public class JWTCreator {
    public static final String HEADER_AUTHORIZATION = "Authorization";
    public static final String ROLES_AUTHORITIES = "authorities";

    public static String create(String prefix, String key, JWTObject jwtObject) {

        String token = Jwts.builder()
                .setSubject(jwtObject.getSubject())
                .setIssuedAt(jwtObject.getIssuedAt())
                .setExpiration(jwtObject.getExpiration())
                .claim(ROLES_AUTHORITIES, jwtObject.getRoleNames())
                .signWith(SignatureAlgorithm.HS512, key).compact();
        return prefix + " " + token;
    }

    public static JWTObject create(String token, String prefix, String key){
        JWTObject jwtObject = new JWTObject();
        token = token.replace(prefix + " ", "");
        Claims claims = Jwts.parser().setSigningKey(key).build().parseClaimsJws(token).getBody();
        jwtObject.setSubject(claims.getSubject());
        jwtObject.setExpiration(claims.getExpiration());
        jwtObject.setIssuedAt(claims.getIssuedAt());

        @SuppressWarnings("unchecked")
        List<String> roleNames = (List <String>) claims.get(ROLES_AUTHORITIES);
        jwtObject.setRoles(roleNames.stream().map(Role::new).toList());
        return jwtObject;
    }
}
