package pqv.webbansach.service;

import org.springframework.security.core.userdetails.UserDetailsService;
import pqv.webbansach.entity.User;

public interface UserSecurityService extends UserDetailsService {
    public User findByUsername(String username);
}
