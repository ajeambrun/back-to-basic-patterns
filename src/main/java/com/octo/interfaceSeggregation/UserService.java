package com.octo.interfaceSeggregation;

public interface UserService {
    String getUsername(int userId);

    String getUsername(User user);

    User getUsr(int userId);
}
