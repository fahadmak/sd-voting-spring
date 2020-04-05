package edu.miu.vote.domain;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name="auth_user")
public class User {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long userId;

    @NotEmpty(message = "Username may not be empty")
    @Column(name="username")
    private String username;

    @NotEmpty(message = "Password may not be empty")
    @Column(name="password")
    private String password;

    @Column(name="activeMem")
    private boolean active;

    @Column(name="role")
    private String role;

    public User () {}

    public User(Long id, String username, String password, String role, boolean active) {
        this.userId = id;
        this.username = username;
        this.password = password;
        this.active = active;
        this.role = role;
    }

    public Long getId() {
        return userId;
    }

    public void setId(Long id) {
        this.userId = id;
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

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
