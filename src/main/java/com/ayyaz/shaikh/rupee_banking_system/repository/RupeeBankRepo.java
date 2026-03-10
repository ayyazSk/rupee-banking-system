package com.ayyaz.shaikh.rupee_banking_system.repository;

import com.ayyaz.shaikh.rupee_banking_system.entity.EmployeeEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface RupeeBankRepo extends CrudRepository<EmployeeEntity, Integer> {
    Optional<EmployeeEntity> findById(int employeeId);
}
