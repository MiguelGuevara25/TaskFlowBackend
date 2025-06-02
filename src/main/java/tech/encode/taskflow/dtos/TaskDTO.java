package tech.encode.taskflow.dtos;

import lombok.Getter;
import lombok.Setter;
import tech.encode.taskflow.entities.User;
import tech.encode.taskflow.enums.TaskStatus;

import java.time.LocalDate;

@Getter
@Setter
public class TaskDTO {
    private Long id;
    private String title;
    private String description;
    private TaskStatus status;
    private LocalDate dateCreated;
    private LocalDate deadline;
    private User user;
}
