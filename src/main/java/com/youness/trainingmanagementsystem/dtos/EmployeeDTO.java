package com.youness.trainingmanagementsystem.dtos;

import lombok.Data;


@Data
public class EmployeeDTO {
    private Integer id;
    private String firstName;
    private String lastName;
    private String email;
    private String username;
    private String password;
    private String phone;
    private String job;
    //private List<Skill> skills;

    /* @Enumerated(EnumType.STRING)
    private Roles role;
    @OneToMany(mappedBy = "employee")
    private List<Skill> skills;
    @OneToMany(mappedBy = "employee")
    private List<ProfileSection> profileSections;

*/
    public EmployeeDTO() {

    }

    //@Override
    //public Collection<? extends GrantedAuthority> getAuthorities() {
    //    return List.of(new SimpleGrantedAuthority(role.name()));}

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
    /* public Roles getRole() {
        return role;
    }

    public void setRole(Roles role) {
        this.role = role;
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

