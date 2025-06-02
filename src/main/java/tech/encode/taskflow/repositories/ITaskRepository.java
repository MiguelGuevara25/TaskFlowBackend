package tech.encode.taskflow.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.encode.taskflow.entities.Task;

public interface ITaskRepository extends JpaRepository<Task, Long> {
}
