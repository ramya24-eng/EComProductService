package com.scaler.firstspringapi.models;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Date;

@MappedSuperclass
public abstract class BaseModel implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // AUTO INCREMENT
    private Long id;

    private Date createdAt;
    private Date updatedAt;

    // Getter for id
    public Long getId() {
        return id;
    }

    // Setter for id
    public void setId(Long id) {
        this.id = id;
    }

    // Getter for createdAt
    public Date getCreatedAt() {
        return createdAt;
    }

    // Setter for createdAt
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    // Getter for updatedAt
    public Date getUpdatedAt() {
        return updatedAt;
    }

    // Setter for updatedAt
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}