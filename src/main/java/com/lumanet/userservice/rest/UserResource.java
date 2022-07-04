package com.lumanet.userservice.rest;

import com.lumanet.userservice.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserResource {

    private final UserService userService;
}
