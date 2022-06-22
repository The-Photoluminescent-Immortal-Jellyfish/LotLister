package com.codeup.adlister.models;

import java.util.List;

public interface ads {
    // get a list of all the ads
    List<lot> all();
    // insert a new ad and return the new ad's id
    int insert(lot ad);
}
