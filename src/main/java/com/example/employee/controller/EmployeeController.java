package com.example.employee.controller;

import com.example.employee.model.Employee;
import com.example.employee.service.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1")
public class EmployeeController {

    @Autowired
    EmployeeServiceImpl employeeService;

    @PostMapping("/signIn")
    public Map<Object,Object>signIn(@RequestBody Employee employee){
        return employeeService.signIn(employee);
    }
}
