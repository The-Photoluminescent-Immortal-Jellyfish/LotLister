package backend.models;

public interface users {
    user findByUsername(String username);
    Long insert(user user);
}
