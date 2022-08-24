package maventest;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.Session;

public class StudentService {
	
	
	public void createStudent(Session session) {
		
		Scanner sc = new Scanner(System.in);
		Student newStudent = new Student();

		System.out.println("Please enter a name for the new Student:");
		newStudent.setName(sc.nextLine());
		System.out.println("Enter a surname for the new Student:");
		newStudent.setSurname(sc.nextLine());
		System.out.println("Which course is the student in, right now? (1-5)");
		newStudent.setCourse(sc.nextInt());
		
        session.beginTransaction();
        session.save(newStudent);
        session.getTransaction().commit();
        
	}
	
	public List<Student> readStudentsList(Session session) {
		
		List<Student> students = session.createQuery("from Student").list();
		return students;
		
	}
	
	public Student getStudentById(Session session, Long id) {
		
	    Query query = session.createQuery("from Student where id = :id");
	    query.setLong("id", id);
	    Student studentas = (Student)query.uniqueResult();
	    return studentas;

	}
	
	public List<Student> readStudentsByCourse(Session session, Integer course) {
		
	    Query query = session.createQuery("from Student where course = :course");
	    query.setInteger("course", course);
	    List<Student> students = query.list();
		return students;
		
	}
	
	

}
