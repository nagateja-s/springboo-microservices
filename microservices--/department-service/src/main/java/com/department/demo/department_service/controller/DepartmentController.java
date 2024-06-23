package com.department.demo.department_service.controller;

import com.department.demo.department_service.dto.DepartmentDto;
import com.department.demo.department_service.service.DepartmentService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
public class DepartmentController {

    private DepartmentService departmentService;

    @PostMapping("/saveDepartment")
    public ResponseEntity<DepartmentDto> saveDepartment(@RequestBody DepartmentDto departmentDto){
        DepartmentDto saveDepartment = departmentService.saveDepartment(departmentDto);
        return new ResponseEntity<>(saveDepartment, HttpStatus.CREATED);
    }

    @GetMapping("{depCode}")
    public ResponseEntity<DepartmentDto> getDepartmentById(@PathVariable String depCode){
        DepartmentDto departmentDto = departmentService.getDepartmentByCode(depCode);
        return new ResponseEntity<>(departmentDto, HttpStatus.OK);
    }
}
