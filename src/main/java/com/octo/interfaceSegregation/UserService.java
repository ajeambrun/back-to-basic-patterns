package com.octo.interfaceSegregation;

public interface UserService {
    String getUsername(int userId);

    String getUsername(User user);

    User getUsr(int userId);
}
