package com.ayyaz.shaikh.rupee_banking_system.model;
import lombok.Data;
import java.time.LocalDate;

@Data
public class Employee {

    private int employeeId;
    private String lastName;
    private String firstName;
    private String title;
    private Integer reportsTo;
    private LocalDate birthDate;
    private LocalDate hireDate;
    private String address;
    private String city;
    private String state;
    private String country;
    private String postalCode;
    private String phone;
    private String fax;
    private String email;
}
