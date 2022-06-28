package backend.models;

import java.sql.SQLException;

public interface Users {
    User findByUsername(String username);
    User insert(String username, String email, String password) throws SQLException;
}
