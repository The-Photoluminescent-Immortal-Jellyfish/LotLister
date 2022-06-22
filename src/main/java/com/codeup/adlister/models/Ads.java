package com.codeup.adlister.models;

import java.util.List;

public interface Ads {
    // get a list of all the ads
    List<LOT> all();
    // insert a new ad and return the new ad's id
    int insert(LOT ad);
}
