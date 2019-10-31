package com.myapp.learnjpa.services;

import com.myapp.learnjpa.entity.Employees;
import com.myapp.learnjpa.repository.EmployeesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeesServiceImpl implements EmployeesService {

    @Autowired(required = true)
    EmployeesRepository employeesRepository;

    @Override
    public List<Employees> getAllEmployees(String firstName) {
        if (firstName != null)
            return employeesRepository.getEmployeesByFirstNameContaining(firstName);
        else
            return employeesRepository.findAll();
    }

}
