package com.thoughtworks.springbootemployee.controller;

import com.thoughtworks.springbootemployee.model.Employee;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping
    public Employee addEmployee(@RequestBody Employee employee){
        return new Employee(employee.getId(), employee.getName(), employee.getAge(),
                employee.getGender());
    }

    @PutMapping("/{id}")
    public Employee updateEmployee(@PathVariable int id,@RequestBody Employee newEmployee){
        Employee oldEmployee = new Employee(id);
        oldEmployee.setName(newEmployee.getName());
        oldEmployee.setAge(newEmployee.getAge());
        oldEmployee.setGender(newEmployee.getGender());
        return oldEmployee;
    }
}
