package com.example.codeclan.employeetracker;

import com.example.codeclan.employeetracker.models.Employee;
import com.example.codeclan.employeetracker.repositories.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EmployeetrackerApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void canAddEmployees(){
		Employee employee = new Employee("Steve Jobs", 47, 1001, "steveJ@applesnstuff.com");
		employeeRepository.save(employee);
	}

}
