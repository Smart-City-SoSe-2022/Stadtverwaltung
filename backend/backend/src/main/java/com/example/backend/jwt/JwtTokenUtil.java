package com.example.backend.jwt;


import com.example.backend.customer.CustomerRepository;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import java.io.Serializable;
import java.util.Base64;
import java.util.function.Function;

import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.impl.crypto.DefaultJwtSignatureValidator;
import org.springframework.stereotype.Component;

import javax.crypto.spec.SecretKeySpec;

@Component
public class JwtTokenUtil implements Serializable {
  private final String secretKey = "thisisthesecretkey";
  byte[] secret = secretKey.getBytes();
  private CustomerRepository customerRepository;

  public JwtTokenUtil(CustomerRepository customerRepository) {
    this.customerRepository = customerRepository;
  }

  public boolean checkLoggedIn(String token) {
    String[] chunks = token.split("\\.");
    Base64.Decoder decoder = Base64.getUrlDecoder();

    String header = new String(decoder.decode(chunks[0]));
    String payload = new String(decoder.decode(chunks[1]));

    SignatureAlgorithm sa = SignatureAlgorithm.HS256;
    SecretKeySpec secretKeySpec = new SecretKeySpec(secretKey.getBytes(), sa.getJcaName());

    String tokenWithoutSignature = chunks[0] + "." + chunks[1];
    String signature = chunks[2];

    DefaultJwtSignatureValidator validator = new DefaultJwtSignatureValidator(sa, secretKeySpec);

    return validator.isValid(tokenWithoutSignature, signature);
  }

  public <T> T getClaimFromToken(String token, Function<Claims, T> claimsResolver){
    final Claims claims = getAllClaimsFromToken(token);
    return claimsResolver.apply(claims);
  }

  private Claims getAllClaimsFromToken(String token) {
    return Jwts.parser().setSigningKey(secret).parseClaimsJws(token).getBody();
  }

}