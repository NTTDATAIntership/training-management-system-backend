package com.youness.trainingmanagementsystem.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Data


@AllArgsConstructor
@Table(name = "manager")

public class Manager extends User{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    public Integer id;
    private String firstName;
    private String lastName;
    private String username;
    private String phone;
    private String job;
    @OneToOne()
    @JoinColumn(name = "user_id")
    private User user;

    // Getters and setters

    public void setUser(User user) {
        this.user = user;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public Manager() {

    }
}
