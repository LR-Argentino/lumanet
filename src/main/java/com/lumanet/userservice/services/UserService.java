package com.lumanet.userservice.services;

import com.lumanet.userservice.model.AppUser;
import com.lumanet.userservice.model.Role;

import java.util.List;

public interface UserService {
    AppUser saveUser(AppUser user);
    Role saveRole(Role role);
    void addRoleToUser(String username, String roleName);
    AppUser getUser(String username);
    List<AppUser> getUsers();
    void deleteUser(AppUser user);

}
