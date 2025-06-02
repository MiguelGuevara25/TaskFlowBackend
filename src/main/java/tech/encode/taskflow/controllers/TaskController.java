package tech.encode.taskflow.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tech.encode.taskflow.dtos.TaskDTO;
import tech.encode.taskflow.dtos.UserDTO;
import tech.encode.taskflow.entities.Task;
import tech.encode.taskflow.entities.User;
import tech.encode.taskflow.servicesinterfaces.ITaskService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/tasks")
@CrossOrigin("*")
public class TaskController {
    @Autowired
    private ITaskService taskService;

    @GetMapping
    public List<TaskDTO> getAllTasks() {
        return taskService.getAllTasks().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, TaskDTO.class);
        }).collect(Collectors.toList());
    }

    @PostMapping
    public void createTask(@RequestBody TaskDTO dto) {
        ModelMapper m = new ModelMapper();
        Task t = m.map(dto, Task.class);
        taskService.createTask(t);
    }

    @DeleteMapping({"/{id}"})
    public void deleteTask(@PathVariable Long id) {
        taskService.deleteTask(id);
    }
}
