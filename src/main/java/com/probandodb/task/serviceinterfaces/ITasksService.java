package com.probandodb.task.serviceinterfaces;

import com.probandodb.task.entities.Tasks;

import java.util.List;

public interface ITasksService {
    public List<Tasks> getAllTasks();
    public void addTask(Tasks ta);
    public void deleteTask(int id);
}
