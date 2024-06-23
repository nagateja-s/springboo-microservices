package com.department.demo.department_service.service.impl;

import com.department.demo.department_service.dto.DepartmentDto;
import com.department.demo.department_service.entity.Department;
import com.department.demo.department_service.mapper.EntityDtoMapper;
import com.department.demo.department_service.repository.DepartmentRepo;
import com.department.demo.department_service.service.DepartmentService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class DepartmentServiceImpl implements DepartmentService {


    private  DepartmentRepo departmentRepo;
    @Override
    public DepartmentDto saveDepartment(DepartmentDto departmentDto) {

        /*Department department = new Department(
                departmentDto.getId(),
                departmentDto.getDepartmentName(),
                departmentDto.getDepartmentDescription(),
                departmentDto.getDepartmentCode()
        );*/
        Department department = EntityDtoMapper.MAPPER.mapToDepartment(departmentDto);

        Department savedDepartment = departmentRepo.save(department);

        /*DepartmentDto savedDepartmentDto = new DepartmentDto(
                savedDepartment.getId(),
                savedDepartment.getDepartmentName(),
                savedDepartment.getDepartmentDescription(),
                savedDepartment.getDepartmentCode()
        );*/
        DepartmentDto savedDepartmentDto = EntityDtoMapper.MAPPER.maptoDepartmentDto(savedDepartment);

        return savedDepartmentDto;
    }

    @Override
    public DepartmentDto getDepartmentByCode(String depCode) {
        Department department = departmentRepo.getDepartmentByDepartmentCode(depCode).get();
        /*DepartmentDto departmentDto = new DepartmentDto(
                department.getId(),
                department.getDepartmentName(),
                department.getDepartmentDescription(),
                department.getDepartmentCode()
        );*/
        DepartmentDto departmentDto = EntityDtoMapper.MAPPER.maptoDepartmentDto(department);
        return departmentDto;
    }
}
