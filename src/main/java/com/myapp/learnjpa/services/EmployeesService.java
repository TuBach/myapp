package com.myapp.learnjpa.services;

import com.myapp.learnjpa.entity.Employees;

import java.util.List;

public interface EmployeesService {
    List<Employees> getAllEmployees(String firstName);
}
