package com.hendisantika.springbootdockerdemo1.controller;

import com.hendisantika.springbootdockerdemo1.model.Employee;
import com.hendisantika.springbootdockerdemo1.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-docker-demo1
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-03-16
 * Time: 10:58
 */
@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    EmployeeRepository employeeRepository;

    @PostMapping
    public Employee create(@RequestBody Employee employee) {

        Employee result = employeeRepository.save(employee);
        return result;
    }

    @GetMapping("/{employeeId}")
    public Optional<Employee> get(@PathVariable String employeeId) {
        return employeeRepository.findById(employeeId);
    }

    @GetMapping
    public List<Employee> getAll() {
        return employeeRepository.findAll();
    }

}