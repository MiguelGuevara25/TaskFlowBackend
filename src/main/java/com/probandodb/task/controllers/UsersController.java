package com.probandodb.task.controllers;

import com.probandodb.task.entities.Users;
import com.probandodb.task.serviceinterfaces.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/users")
public class UsersController {
    @Autowired
    private IUserService usS;

    @GetMapping
    public List<Users> getAllUsers(){
        return usS.getAllUsers();
    }

    @PostMapping
    public void addUser(@RequestBody Users us){
        usS.addUser(us);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable int id){
        try {
            usS.deleteUser(id);
            System.out.println("Usuario eliminado con éxito");
        } catch (Exception e) {
            throw new RuntimeException("No puedes eliminar un usuario con tareas asignadas");
        }
    }
}
