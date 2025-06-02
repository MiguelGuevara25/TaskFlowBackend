package tech.encode.taskflow.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.encode.taskflow.entities.Task;
import tech.encode.taskflow.repositories.ITaskRepository;
import tech.encode.taskflow.servicesinterfaces.ITaskService;

import java.util.List;

@Service
public class TaskServiceImplement implements ITaskService {
    @Autowired
    private ITaskRepository taskRepository;

    @Override
    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    @Override
    public Task getTaskById(Long id) {
        return taskRepository.findById(id).orElse(new Task());
    }

    @Override
    public void createTask(Task task) {
        taskRepository.save(task);
    }

    @Override
    public void updateTask(Task task) {
        taskRepository.save(task);
    }

    @Override
    public void deleteTask(Long id) {
        taskRepository.deleteById(id);
    }
}
