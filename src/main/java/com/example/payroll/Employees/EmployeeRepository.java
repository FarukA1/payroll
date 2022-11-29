package com.example.payroll.Employees;

//import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;


public interface EmployeeRepository extends CrudRepository <Employee, Long> {
    

}
