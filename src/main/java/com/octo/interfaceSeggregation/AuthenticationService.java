package com.octo.interfaceSeggregation;

public class AuthenticationService {

    UserService userService;

    public AuthenticationService(UserService userService) {
        this.userService = userService;
    }

    public boolean checkUserExists(int userId) {
        return ! "".equals(userService.getUsername(userId));
    }
}
