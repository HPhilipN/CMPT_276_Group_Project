package com.backend.backend.models;

import jakarta.persistence.*;

/**
 * @uid has the purpose of identifying users for admin/moderator purposes
 */
@Entity
@Table(name = "users")
public class User {
    // next 2 lines create a serial datatype for uid, allowing auto-update
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int uid;

    @Column(unique = true)
    private String email;

    private String name;
    private String password;
    private boolean isChef;
    private boolean isModerator;

    // Constructors
    public User() {
    }

    public User(String name, String email, String password, boolean isChef, boolean isModerator) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.isChef = isChef;
        this.isModerator = isModerator;
    }

    // Getters & Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isChef() {
        return isChef;
    }

    public void setChef(boolean isChef) {
        this.isChef = isChef;
    }

    public boolean isModerator() {
        return isModerator;
    }

    public void setModerator(boolean isModerator) {
        this.isModerator = isModerator;
    }

    public int getUid() {
        return uid;
    }

    // toString for displaying users in terminal & debugging purposes
    @Override
    public String toString() {
        return "User [uid=" + uid + ", email=" + email + ", name=" + name + ", password=" + password + ", isChef="
                + isChef + ", isModerator=" + isModerator + "]";
    }
    
}
