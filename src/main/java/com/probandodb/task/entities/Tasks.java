package com.probandodb.task.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "tasks")
public class Tasks {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "description", nullable = false)
    private String description;

    @Column(name = "state", nullable = false)
    private String state;

    @Column(name = "date_deadline", nullable = false)
    private LocalDate date_deadline;

    @Column(name = "date_created", nullable = false)
    private String date_created;

    @ManyToOne
    @JoinColumn(name = "id_users")
    private Users users;

    public Tasks(Long id, String title, String description, String state, LocalDate date_deadline, String date_created, Users users) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.state = state;
        this.date_deadline = date_deadline;
        this.date_created = date_created;
        this.users = users;
    }

    public Tasks() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public LocalDate getDate_deadline() {
        return date_deadline;
    }

    public void setDate_deadline(LocalDate date_deadline) {
        this.date_deadline = date_deadline;
    }

    public String getDate_created() {
        return date_created;
    }

    public void setDate_created(String date_created) {
        this.date_created = date_created;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }
}
