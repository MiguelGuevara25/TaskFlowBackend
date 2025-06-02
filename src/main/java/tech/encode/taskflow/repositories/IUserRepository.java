package tech.encode.taskflow.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.encode.taskflow.entities.User;

public interface IUserRepository extends JpaRepository<User, Long> {
}
