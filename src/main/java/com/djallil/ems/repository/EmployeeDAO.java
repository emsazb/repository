package com.djallil.ems.repository;

import com.djallil.ems.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface EmployeeDAO extends JpaRepository<Employee, Integer> {
}


