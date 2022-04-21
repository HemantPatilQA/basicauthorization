package com.selflearning.authorizationwithjwt.config;

import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException{
        List<SimpleGrantedAuthority> roles = null;
        if(username.equals("admin")){
            roles = Arrays.asList(new SimpleGrantedAuthority("ROLE_ADMIN"));
            return new User("admin", "$2a$10$qGTbmRHF7s/e9Tqjo2K1yuHbA8lXBdmVpiX8K.XG9Ikd53WNbkoN.", roles);
        }else if(username.equals("user")){
            roles = Arrays.asList(new SimpleGrantedAuthority("ROLE_USER"));
            return new User("user", "$2a$10$TPuad.CWXlK6C8TzwxVgf.gwdsTegWp4Tiz29XPzz4winMutd6S7C", roles);
        }else if(username.equals("hemant")){
        roles = Arrays.asList(new SimpleGrantedAuthority("ROLE_ADMIN"));
        return new User("hemant", "$2a$10$TPuad.CWXlK6C8TzwxVgf.gwdsTegWp4Tiz29XPzz4winMutd6S7C", roles);
    }
        throw new UsernameNotFoundException("User not found with username : " + username);
    }

}
