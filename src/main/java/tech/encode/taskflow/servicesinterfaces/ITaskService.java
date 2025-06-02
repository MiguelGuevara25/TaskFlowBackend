package tech.encode.taskflow.servicesinterfaces;

import tech.encode.taskflow.entities.Task;

import java.util.List;

public interface ITaskService {
    public List<Task> getAllTasks();
    public Task getTaskById(Long id);
    public void createTask(Task task);
    public void updateTask(Task task);
    public void deleteTask(Long id);
}
