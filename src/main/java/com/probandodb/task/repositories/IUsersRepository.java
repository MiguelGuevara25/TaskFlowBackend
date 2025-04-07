package com.probandodb.task.repositories;

import com.probandodb.task.entities.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUsersRepository extends JpaRepository<Users, Integer> {
}
