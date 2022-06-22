package com.codeup.adlister.models;

public interface Users {
    USER findByUsername(String username);
    Long insert(USER user);
}
