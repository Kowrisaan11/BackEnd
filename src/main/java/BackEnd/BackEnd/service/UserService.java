package BackEnd.BackEnd.service;

import BackEnd.BackEnd.model.User;

import java.util.List;

public interface UserService {
    public User saveUser(User user);
    public List<User> getAllUsers();
}
