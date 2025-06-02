package tech.encode.taskflow.dtos;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class UserDTO {
    private Long id;
    private Boolean active;
    private String username;
    private String email;
    private LocalDate creationDate;
}
