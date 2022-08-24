package maventest;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.annotations.Entity;
import org.hibernate.cfg.AnnotationConfiguration;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Maven hello!");
		StudentService studentService = new StudentService();
		
        SessionFactory sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();

        
        //studentService.createStudent(session);
        
        List<Student> allStudents = studentService.readStudentsList(session);
        for(Student student : allStudents) {
        	System.out.println(student.getId() + " " + student.getName() + " " + student.getSurname() + " " + student.getCourse());
        }

        System.out.println("2 course students");
        
        List<Student> courseStudents = studentService.readStudentsByCourse(session, 2);
        for(Student student : courseStudents) {
        	System.out.println(student.getId() + " " + student.getName() + " " + student.getSurname() + " " + student.getCourse());
        }
		
	}

}
