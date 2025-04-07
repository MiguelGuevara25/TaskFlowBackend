package com.probandodb.task.serviceimplements;

import com.probandodb.task.entities.Tasks;
import com.probandodb.task.repositories.ITasksRepository;
import com.probandodb.task.serviceinterfaces.ITasksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TasksServiceImplement implements ITasksService {
    @Autowired
    private ITasksRepository taR;

    @Override
    public List<Tasks> getAllTasks() {
        return taR.findAll();
    }

    @Override
    public void addTask(Tasks ta) {
        taR.save(ta);
    }

    @Override
    public void deleteTask(int id) {
        taR.deleteById(id);
    }
}
