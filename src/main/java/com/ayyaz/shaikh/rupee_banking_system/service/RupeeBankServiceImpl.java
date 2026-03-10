package com.ayyaz.shaikh.rupee_banking_system.service;

import com.ayyaz.shaikh.rupee_banking_system.model.Employee;
import com.ayyaz.shaikh.rupee_banking_system.repository.RupeeBankRepo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class RupeeBankServiceImpl implements RupeeBankService{

    private RupeeBankRepo bankRepo;
    private org.modelmapper.ModelMapper modelMapper;

    @Autowired
    public void setSecurityRepo(RupeeBankRepo bankRepo,org.modelmapper.ModelMapper modelMapper) {
        this.bankRepo = bankRepo;
        this.modelMapper = modelMapper;
    }

    @Override
    public Employee getEmployeedDetail(int employeeId) {
        com.ayyaz.shaikh.rupee_banking_system.entity.EmployeeEntity employeeDetails =  bankRepo.findById(employeeId).orElseThrow(()-> new RuntimeException("Exception occured "+ employeeId));

        log.info("Response returned  {} ");
        return modelMapper.map(employeeDetails, Employee.class);
    }
}
