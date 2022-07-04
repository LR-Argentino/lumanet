package com.lumanet.userservice.services;

import com.lumanet.userservice.model.AppUser;
import com.lumanet.userservice.model.Role;
import com.lumanet.userservice.repository.RoleRepository;
import com.lumanet.userservice.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
@Service
@RequiredArgsConstructor
@Transactional
@Slf4j
public class UserServiceImpl implements UserService{
    @Autowired
    private final UserRepository userRepository;

    @Autowired
    private final RoleRepository roleRepository;

    @Override
    public AppUser saveUser(AppUser user) {
        log.info("Saving user {} to database ", user.getName());
        return userRepository.save(user);
    }

    @Override
    public Role saveRole(Role role) {
        log.info("Saving role to database");
        return roleRepository.save(role);
    }

    @Override
    public void addRoleToUser(String username, String roleName) {
        log.info("Add role {} to user", roleName);
        AppUser user = userRepository.findAppUserByName(username);
        Role role = roleRepository.findByName(roleName);
        user.getRoles().add(role);
    }

    @Override
    public AppUser getUser(String username) {
        log.info("Get User {}", username);
        return userRepository.findAppUserByName(username);
    }

    @Override
    public List<AppUser> getUsers() {
        return null;
    }

    @Override
    public void deleteUser(AppUser user) {

    }
}
