package com.probandodb.task.serviceimplements;

import com.probandodb.task.entities.Users;
import com.probandodb.task.repositories.IUsersRepository;
import com.probandodb.task.serviceinterfaces.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersServiceImplement implements IUserService {
    @Autowired
    private IUsersRepository usR;

    @Override
    public List<Users> getAllUsers() {
        return usR.findAll();
    }

    @Override
    public void addUser(Users us) {
        usR.save(us);
    }

    @Override
    public void deleteUser(int id) {
        try {
            usR.deleteById(id);
        } catch (Exception e) {
            throw new RuntimeException("Error al eliminar el usuario con id: " + id);
        }
    }
}
