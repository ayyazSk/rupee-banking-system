package com.ayyaz.shaikh.rupee_banking_system.controller;

import com.ayyaz.shaikh.rupee_banking_system.model.Employee;
import com.ayyaz.shaikh.rupee_banking_system.service.RupeeBankService;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
@Slf4j
public class RupeeBankController {


        private RupeeBankService bankService;

        @Autowired
        public void rupeeBankController(RupeeBankService bankService) {

            this.bankService = bankService;
        }

        @GetMapping("/fetchUser/{id}")
        public ResponseEntity<Employee> GetEmployeeDetail(@PathVariable("id") int employeeId){

            log.info("Inside GetEmployeeDetails for EId : {} ",employeeId );

            Employee details = bankService.getEmployeedDetail(employeeId);

            return  ResponseEntity.status(HttpStatus.FOUND).body(details);
        }


    }



