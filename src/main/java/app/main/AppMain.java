package app.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import app.model.Student;
import app.service.StudentService;

public class AppMain {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		StudentService studentService = (StudentService) context.getBean("studentService");
		
		for(int i=1; i<=5;i++) {
			Student stNew = new Student("per "+i, "per"+i+"@gmail.com", i);
			System.out.println(studentService.createStudent(stNew));
		}
		
//		Student st = studentService.findById(2);
//		System.out.println("\t id: " + st.getId());
//
//		 Student stUpdate = new Student(4, "update Name", "update@gmail.com",
//		 0);
//		 System.out.println(studentService.updateStudent(stUpdate));
//
//		 Student stDelete = new Student(2, "update Name", "update@gmail.com",
//		 0);
//		 System.out.println(studentService.deleteStudent(stDelete));

	}

}
