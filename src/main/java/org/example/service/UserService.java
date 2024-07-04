package org.example.service;

import org.example.model.Role;
import org.example.model.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.List;

public interface UserService extends UserDetailsService {
    @Override
    UserDetails loadUserByUsername(String email) throws UsernameNotFoundException;
    List<User> listAll();

    User getById(Long id);

    void save(User user);

    void delete(Long id);

    void update(User user);

    User findByEmail(String email);

    List<Role> listRoles();

}
