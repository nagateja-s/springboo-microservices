package com.department.demo.department_service.mapper;

import com.department.demo.department_service.dto.DepartmentDto;
import com.department.demo.department_service.entity.Department;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface EntityDtoMapper {

    EntityDtoMapper MAPPER = Mappers.getMapper(EntityDtoMapper.class);

    DepartmentDto maptoDepartmentDto(Department department);
    Department mapToDepartment(DepartmentDto departmentDto);

}
