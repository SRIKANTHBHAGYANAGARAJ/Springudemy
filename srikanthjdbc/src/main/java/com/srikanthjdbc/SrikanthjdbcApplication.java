package com.srikanthjdbc;

import com.srikanthjdbc.model.Student;
import com.srikanthjdbc.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class SrikanthjdbcApplication {

	public static void main(String[] args) {
		ApplicationContext context =  SpringApplication.run(SrikanthjdbcApplication.class, args);
		Student s = context.getBean(Student.class);
		s.setRollNo(122);
		s.setMarks(50);
		s.setName("Srikanth");


		StudentService service =context.getBean(StudentService.class);
		service.addStudent(s);
		List<Student> students = service.getStudents();
		System.out.println(students);
	}

}
