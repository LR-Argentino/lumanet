package com.lumanet.userservice.repository;

import com.lumanet.userservice.model.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<AppUser, Long> {
    AppUser findAppUserByName(String name);
}
