package com.example.payroll.Employees;

//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
public class LoadDatabase implements CommandLineRunner {
    
    private final EmployeeRepository repository;

    public LoadDatabase(EmployeeRepository repository) {
            this.repository = repository;
    }

    @Override
	public void run(String... strings) throws Exception {
        this.repository.save(new Employee("Dan", "Smith", "lsdfsgdh@gmail.com", "07412345678", "1 Downing Street",
        "Marketing", 25000));
        this.repository.save(new Employee("Mark", "Owen", "lsdfsgdh@outlook.com", "07412345678", "1 Water Street",
        "Finance", 30000));
	}
}
