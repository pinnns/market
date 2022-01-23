package shop.ohjinn.dangeun.config.jwt;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.GrantedAuthority;

import java.util.List;

public class MemberAuthentication extends UsernamePasswordAuthenticationToken {

    public MemberAuthentication(String principal, String credentials){
        super(principal, credentials);
    }

    public MemberAuthentication(String principal, String credentials,
        List<GrantedAuthority> authorities){

        super(principal, credentials, authorities);
    }
}
