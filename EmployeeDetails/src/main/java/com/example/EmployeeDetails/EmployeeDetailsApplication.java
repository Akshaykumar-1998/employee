package com.example.EmployeeDetails;
import com.example.EmployeeDetails.entity.Employee;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import java.util.List;
@SpringBootApplication
public class EmployeeDetailsApplication {
	public static void main(String[] args) {
	ConfigurableApplicationContext context= SpringApplication.run(EmployeeDetailsApplication.class, args);

	}
}
