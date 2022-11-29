package com.example.payroll.Employees;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;


@Entity 
public class Employee {

    private @Id @GeneratedValue Long id;
    private String firstName;
    private String secondName;
    private String email;
    private String phone;
    private String address;
    private String department;
    private double salary;

    Employee() {}

    public Employee(String firstName, String secondName, String email, String phone,
    String address, String department, double salary) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.department = department;
        this.salary = salary;
    }

    public String getName() {
      return this.firstName + " " + this.secondName;
    }
  
    public void setName(String name) {
      String[] parts = name.split(" ");
      this.firstName = parts[0];
      this.secondName = parts[1];
    }

    public Long getId() {
        return this.id;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getSecondName() {
      return this.secondName;
    }

    public String getEmail() {
        return this.email;
    }

    public String getPhone() {
      return this.phone;
    }

    public String getAddress() {
      return this.address;
    }

    public String getDepartment() {
      return this.department;
    }

    public double getSalary() {
      return this.salary;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSecondName(String firstName) {
      this.firstName = firstName;
    }

    public void setEmail(String role) {
        this.email = role;
    }

    public void setPhone(String phone) {
      this.phone = phone;
    }

    public void setAddress(String address) {
      this.address = address;
    }

    public void setDepartment(String department) {
      this.department = department;
    } 

    public void setSalary(Double salary) {
      this.salary = salary;
  }
    

    @Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Employee employee = (Employee) o;
		return Objects.equals(id, employee.id) &&
			Objects.equals(firstName, employee.firstName) &&
			Objects.equals(secondName, employee.secondName) &&
			Objects.equals(email, employee.email) &&
      Objects.equals(phone, employee.phone) &&
      Objects.equals(address, employee.address) &&
      Objects.equals(department, employee.department) &&
      Objects.equals(salary, employee.salary);
	}
  
    @Override
    public int hashCode() {
      return Objects.hash(this.id, this.firstName, this.secondName, this.email, this.phone,
      this.address, this.department, this.salary);
    }
  
    @Override
    public String toString() {
      return "Employee{" + "id=" + this.id + ", first name='" + this.firstName + ", second name='" + this.secondName + '\'' + ", email='" + this.email + '\'' +
      ", phone='" + this.phone + '\'' + ", address='" + this.address + '\'' + ", department='" + this.department + '\'' + ", salary='" + this.salary + '\'' + '}';
    }
    
}
