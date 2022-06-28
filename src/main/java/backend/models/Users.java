package backend.models;

import java.sql.SQLException;

public interface Users {


    User findByUsername(String username);

    void insert(User user) throws SQLException;
}
