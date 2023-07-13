package com.example.employee.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Employee {
    private String employeeName;
    @Id
    private int employeeId;
    private int employeeAge;
    private String employeeLocation;
    private int activeIndex;
}
