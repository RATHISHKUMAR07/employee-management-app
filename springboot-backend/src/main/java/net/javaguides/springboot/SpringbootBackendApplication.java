package net.javaguides.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import net.javaguides.springboot.model.Employee;
import net.javaguides.springboot.repository.EmployeeRepository;

@SpringBootApplication
public class SpringbootBackendApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackendApplication.class, args);
	}

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public void run(String... args) throws Exception {

		Employee emp1 = Employee.builder()
				.firstName("Rathish Kumar")
				.lastName("Madhavan")
				.empid("EMP1001")
				.email("rathishkumar@gmail.com")
				.build();

		Employee emp2 = Employee.builder()
				.firstName("Naveen Kumar")
				.lastName("Madhavan")
				.empid("EMP1002")
				.email("naveenkumar@gmail.com")
				.build();

		employeeRepository.save(emp1);
		employeeRepository.save(emp2);
	}
}