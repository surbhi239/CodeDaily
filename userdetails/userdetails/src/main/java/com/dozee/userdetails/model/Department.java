package com.dozee.userdetails.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "department")
public class Department implements Serializable{

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "department_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int department_id;

    @Column(name = "name")
    private String name;

    @Column(name = "role")
    private String role;

    public Department(int department_id, String name, String role) {
        this.department_id = department_id;
        this.name = name;
        this.role = role;
    }

    public Department() {
    }

    public int getDepartment_id() {
        return department_id;
    }

    public void setDepartment_id(int department_id) {
        this.department_id = department_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
