package backend.models;

public interface Users {
    User findByUsername(String username);
    Long insert(String username, String email, String password);
}
