package com.example.practiceapplication.model;

import org.springframework.data.annotation.Id;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;

@Entity
@Table(name="Users")
public class User implements UserDetails{

    @Id
    @javax.persistence.Id
    @Column(nullable = false, unique = true, length = 50)
    private String email;

    @Column(nullable = false, length = 100)
    private String password;


    @Column(length=30)
    private String username;

    @Column(length = 30)
    private ClassRank classRank;

    @Column(length = 50)
    private String school;

    @Column(length = 4)
    private Integer hoursCompleted;

    @Column(length = 3)
    private Integer hoursTaking;

    @Column
    private Boolean enabled;

    @Column
    private UserRole userRole;

    @Column
    private Date joinDate;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities(){
        SimpleGrantedAuthority authority = new SimpleGrantedAuthority((UserRole.name()));

        return Collections.singletonList(authority);
    }

    public User(String username, String email, String password, UserRole role, String school, ClassRank classRank, Integer hoursCompleted) {
        this.enabled=false;
        this.username = username;
        this.email=email;
        this.password=password;
        this.school = school;
        this.classRank = classRank;
        this.hoursCompleted = hoursCompleted;
        this.userRole = role;

    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public Date getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(Date joinDate) {
        this.joinDate = joinDate;
    }

    public String getClassRank() {
        return classRank;
    }

    public void setClassRank(String classRank) {
        this.classRank = classRank;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public Integer getHoursCompleted() {
        return hoursCompleted;
    }

    public void setHoursCompleted(Integer hoursCompleted) {
        this.hoursCompleted = hoursCompleted;
    }

    public Integer getHoursTaking() {
        return hoursTaking;
    }

    public void setHoursTaking(Integer hoursTaking) {
        this.hoursTaking = hoursTaking;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean Enabled) {
        enabled = Enabled;
    }
}