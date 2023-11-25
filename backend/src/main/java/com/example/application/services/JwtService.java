package com.example.application.services;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;
import org.springframework.stereotype.Component;

import java.security.Key;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Base64;

@Component
public class JwtService {
    public static final String  Secret= "FDAsv7U01uGydYX1Wt0UL5683lEWYR83HJagpbRWhv8jlvjOKgU3FL62rtqBZOBf";
    public static final Date EXPIREYDATE = new Date(System.currentTimeMillis() + 1000 * 60 * 30);
    public static final Date ISSUEDDATE= new Date(System.currentTimeMillis());

    public String generateToken(String username){
        Map<String,Object> claims= new HashMap<>();
        return createToken(claims,username);
    }

    private String createToken(Map<String, Object> claims, String username) {
        return Jwts.builder()
                .setClaims(claims)
                .setSubject(username)
                .setIssuedAt(ISSUEDDATE)
                .setExpiration(EXPIREYDATE)
                .signWith(getSignKey(), SignatureAlgorithm.HS256).compact();
    }

    private Key getSignKey() {
        byte[] keyByte= Decoders.BASE64.decode(Secret);
        return Keys.hmacShaKeyFor(keyByte);
    }
}
