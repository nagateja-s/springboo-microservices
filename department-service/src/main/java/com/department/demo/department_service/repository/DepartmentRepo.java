package com.department.demo.department_service.repository;

import com.department.demo.department_service.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface DepartmentRepo  extends JpaRepository<Department, Long> {

    Optional<Department> getDepartmentByDepartmentCode(String code);
}
