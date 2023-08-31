package com.youness.trainingmanagementsystem.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;

import lombok.Data;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;

@Entity
@Data


@AllArgsConstructor
@Table(name = "employee")


public class Employee extends User {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    public Integer id;
    private String firstName;
    private String lastName;
    private String username;
    private String phone;
    private String job;
    @OneToMany(mappedBy = "employee")
    private List<Skill> skills;
    @OneToMany(mappedBy = "employee")
    private List<ProfileSection> profileSections;


    public Employee() {

    }
    @OneToOne()
    @JoinColumn(name = "user_id")
    private User user;

    // Getters and setters

    public void setUser(User user) {
        this.user = user;
    }

    //@Override
    //public Collection<? extends GrantedAuthority> getAuthorities() {
    //    return List.of(new SimpleGrantedAuthority(role.name()));}


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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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


}
/*
    @Override
    public boolean isAccountNonExpired() {
        return false;
    }

    @Override
    public boolean isAccountNonLocked() {
        return false;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return false;
    }

    @Override
    public boolean isEnabled() {
        return false;
    }
}
*/

