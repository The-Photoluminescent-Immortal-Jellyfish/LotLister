package com.codeup.adlister.dao.ref;

import com.codeup.adlister.models.User;

public interface Users {
    User findByUsername(String username);
    Long insert(User user);
}
