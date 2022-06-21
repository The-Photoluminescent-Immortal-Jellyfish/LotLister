

package com.codeup.adlister.util;

import org.mindrot.jbcrypt.BCrypt;

public class codeRunner {

    public static void main(String[] args) {

        String password = "supersecretpw";

        String hashPW8 = BCrypt.hashpw(password, BCrypt.gensalt(8));
        String hashPW10 = BCrypt.hashpw(password, BCrypt.gensalt(10));
        String hashPW12 = BCrypt.hashpw(password, BCrypt.gensalt(12));

        System.out.println(password + " was our original password");
        System.out.println(hashPW8 + ": (8 rounds) is the result after a little bcrypt :o");
        System.out.println(hashPW10 + ": (10 rounds) is the result after a little bcrypt :o");
        System.out.println(hashPW12 + ": (12 rounds) is the result after a little bcrypt :o");

        System.out.println();

        System.out.println("BCrypt.checkpw(\"notsosecretpw\", hashPW12) = " + BCrypt.checkpw("notsosecretpw", hashPW12));

    }
}