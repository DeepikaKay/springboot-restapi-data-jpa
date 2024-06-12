package com.learning.app.springboot_rest_api_demo.repository;

import com.learning.app.springboot_rest_api_demo.model.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Long>
{

    List<EmployeeEntity> findBySalary(double salary);
    List<EmployeeEntity> findByDepartment(String department);
}


