package com.probandodb.task.repositories;

import com.probandodb.task.entities.Tasks;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITasksRepository extends JpaRepository<Tasks, Integer> {
}
