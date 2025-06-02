package tech.encode.taskflow.servicesinterfaces;

import tech.encode.taskflow.entities.User;

import java.util.List;

public interface IUserService {
    public List<User> getAllUsers();
    public User getUserById(Long id);
    public void createUser(User user);
    public void updateUser(User user);
    public void deleteUser(Long id);
}
