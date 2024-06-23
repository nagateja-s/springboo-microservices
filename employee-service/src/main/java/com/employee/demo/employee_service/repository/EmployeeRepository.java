package com.employee.demo.employee_service.repository;

import com.employee.demo.employee_service.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.ResponseBody;


public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
