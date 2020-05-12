package com.example.codeclan.One.To.Many.and.Many.to.Many_Demo;

import com.example.codeclan.One.To.Many.and.Many.to.Many_Demo.models.Department;
import com.example.codeclan.One.To.Many.and.Many.to.Many_Demo.models.Employee;
import com.example.codeclan.One.To.Many.and.Many.to.Many_Demo.models.Project;
import com.example.codeclan.One.To.Many.and.Many.to.Many_Demo.repositories.DepartmentRepository;
import com.example.codeclan.One.To.Many.and.Many.to.Many_Demo.repositories.EmployeeRepository;
import com.example.codeclan.One.To.Many.and.Many.to.Many_Demo.repositories.ProjectRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class OneToManyAndManyToManyDemoApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Autowired
	DepartmentRepository departmentRepository;

	@Autowired
	ProjectRepository projectRepository;


	@Test
	void contextLoads() {
	}

	@Test
	public void CreateEmployee() {

		Project project = new Project("this", 7);
				projectRepository.save(project);

		Department department = new Department("Test");
				departmentRepository.save(department);

		Employee employee = new Employee("Jack", "Smith", 143, department);
				employeeRepository.save(employee);

				employee.addProject(project);
				project.addEmployee(employee);

				employeeRepository.save(employee);
				projectRepository.save(project);
	}

}
