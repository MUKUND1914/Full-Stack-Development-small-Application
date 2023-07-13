package com.example.employee.service;

import com.example.employee.model.Employee;
import com.example.employee.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class EmployeeServiceImpl {
    @Autowired
    EmployeeRepo employeeRepo;

    public Map<Object,Object> signIn(Employee employee){
        Map<Object,Object>resultMap=new HashMap<>();
        try{
            employeeRepo.save(employee);
            resultMap.put("status","success");
            resultMap.put("message","successfully signed in");
            return resultMap;
        }
        catch (Exception e){
            resultMap.put("status","failure");
            resultMap.put("message","error occurred while adding the Data to DB");
        }
        return null;
    }
}
