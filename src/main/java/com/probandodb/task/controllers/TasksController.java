package com.probandodb.task.controllers;

import com.probandodb.task.entities.Tasks;
import com.probandodb.task.serviceinterfaces.ITasksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/tasks")
public class TasksController {
    @Autowired
    private ITasksService taS;

    @GetMapping
    public List<Tasks> getAllTasks(){
        return taS.getAllTasks();
    }

    @PostMapping
    public void addTask(@RequestBody Tasks ta){
        taS.addTask(ta);
    }

    @DeleteMapping("/{id}")
    public void deleteTask(@PathVariable int id){
        taS.deleteTask(id);
    }
}
