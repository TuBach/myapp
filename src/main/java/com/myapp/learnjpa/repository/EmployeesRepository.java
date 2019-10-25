package com.myapp.learnjpa.repository;

import com.myapp.learnjpa.entity.Employees;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeesRepository extends JpaRepository<Employees, Long> {
    List<Employees> getEmployeesByFirstNameContaining(String firstName);
}
