package com.probandodb.task.serviceinterfaces;

import com.probandodb.task.entities.Users;

import java.util.List;

public interface IUserService {
    public List<Users> getAllUsers();
    public void addUser(Users us);
    public void deleteUser(int id);
}
