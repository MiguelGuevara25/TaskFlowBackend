package tech.encode.taskflow.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import tech.encode.taskflow.enums.TaskStatus;

import java.time.LocalDate;

@Entity
@Table(name = "tasks")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String title;
    @Column(nullable = false,length = 250)
    private String description;
    @Column(nullable = false)
    private TaskStatus status;
    @Column(nullable = false)
    private LocalDate dateCreated;
    @Column(nullable = false)
    private LocalDate deadline;

    @ManyToOne
    @JoinColumn(name = "idUser",nullable = false)
    private User user;

    @PrePersist
    protected void onCreate() {
        dateCreated = LocalDate.now();
    }
}
