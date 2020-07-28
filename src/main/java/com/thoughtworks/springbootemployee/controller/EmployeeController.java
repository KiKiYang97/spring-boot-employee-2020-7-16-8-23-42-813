package com.thoughtworks.springbootemployee.controller;

import com.thoughtworks.springbootemployee.model.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Dunka
 * @Description //TODO
 * @Date 0:17   2020/7/29
 * @ClassName EmployeeController
 */
@RestController
@RequestMapping("/employees")
public class EmployeeController {
    @GetMapping
    public List<Employee> getAllEmployees() {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "Kiki", 18, "female"));
        employees.add(new Employee(2, "Eason", 25, "male"));
        employees.add(new Employee(3, "Eva", 18, "female"));
        return employees;
    }
}
