import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Mainas {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File data = new File("data.txt");
		File results = new File("results.txt");
		File resultStudents = new File("resultStudents.txt");
		resultStudents.createNewFile();
		results.createNewFile();
		
		FileWriter fileWriter = new FileWriter(results, false);
		FileWriter fileWriterStudents = new FileWriter(resultStudents, false);
		
		data.createNewFile();
		List<String> list = new ArrayList<>();
		
		try {
			Scanner scanner = new Scanner(data);
			
			while(scanner.hasNext()) {
				list.add(scanner.next());
			}
			
			fileWriter.write("Original data list: \n");
			writeListToFile(list, fileWriter);
			
			StringContainsA(list, fileWriter);
			StringsLongerThan6(list, fileWriter);
			StringOrderUnalphabetic(list, fileWriter);
			uniqueStringsCount(list, fileWriter);
			stringsStartingWithS(list, fileWriter);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("file does not exists");
		}
		fileWriter.close();
		
		List<Student> students = readStudentsFromFile();
		fileWriterStudents.write("Original students list: \n");
		printStudentsList(students, fileWriterStudents);
		
		
		findNon1CourseStudents(students, fileWriterStudents);
		findFemaleStudents(students, fileWriterStudents);
		sortStudentsByName(students, fileWriterStudents);
		
		fileWriterStudents.close();
		
		System.out.println("Program finished");

	}
	
	
	
	public static void findNon1CourseStudents(List<Student> students, FileWriter fileWriterStudents) throws IOException {
		
		
		List<Student> nonFirstCourseStudents = students
				.stream()
				.filter(student -> student.getCourse() != 1)
				.collect(Collectors.toList());
		
		fileWriterStudents.write("Non first course students: \n");
		printStudentsList(nonFirstCourseStudents, fileWriterStudents);
		
	}
	
	public static void findFemaleStudents(List<Student> students, FileWriter fileWriterStudents) throws IOException {
		List<Student> femaleStudents = students
				.stream()
				.filter(student -> student.getName().endsWith("a") || student.getName().endsWith("e"))
				.collect(Collectors.toList());
				
		fileWriterStudents.write("Female students: \n");
		printStudentsList(femaleStudents, fileWriterStudents);
	}
	
	
	public static void sortStudentsByName(List<Student> students, FileWriter fileWriterStudents) throws IOException {
		List<Student> sortedStudents = students
				.stream()
				.sorted(Comparator.comparing(Student::getName, Comparator.naturalOrder()))
				.collect(Collectors.toList());
				
		fileWriterStudents.write("Sorted by name students: \n");
		printStudentsList(sortedStudents, fileWriterStudents);
	}
	
	public static void printStudentsList(List<Student> students, FileWriter fileWriterStudents) throws IOException {
		
		
		for(Student student : students) {
			fileWriterStudents.write(String.format("Student name: %s, student nr: %s course: %d, Phone: %s \n", student.getName(), student.getStudentNr(), student.getCourse(), student.getPhoneNumber()));
		}
	}
	
	
	
	public static List<Student> readStudentsFromFile() throws FileNotFoundException {
		
		List<Student> students = new ArrayList<>();
		File studentsData = new File("studentsData.txt");
		Scanner studentsScanner = new Scanner(studentsData);
		
		while(studentsScanner.hasNextLine()) {
			String line = studentsScanner.nextLine();
			System.out.println(line);
			String[] fields = line.split(";");
			students.add(new Student(fields[0], fields[1], Integer.valueOf(fields[2]), fields[3]));
		}
		
		
		return students;
	
	}
	
	
	public static void writeListToFile(List<String> list, FileWriter fileWriter) throws IOException {
		
		for(int i = 0; i < list.size(); i++) {
			fileWriter.write(list.get(i) + ",");
		}
		fileWriter.write("\n");
		
	}
	
	public static void StringContainsA(List<String> list, FileWriter fileWriter) throws IOException {
		List<String> listContainsA = list
				.stream()
				.filter(word -> word.contains("A") || word.contains("a"))
				.collect(Collectors.toList());
		fileWriter.write("Strings containing a/A \n");
		writeListToFile(listContainsA, fileWriter);
	}
	
	
	public static void StringsLongerThan6(List<String> list, FileWriter fileWriter) throws IOException {
		Long listLongerThan6 = list
				.stream()
				.filter(word -> word.length() > 6)
				.count();
		fileWriter.write("Strings longer than 6 count: " + listLongerThan6 + "\n");
	}
	
	public static void StringOrderUnalphabetic(List<String> list, FileWriter fileWriter) throws IOException {
		List<String> orderedUnalphabetic = list
				.stream()
				.sorted(Comparator.reverseOrder())
				.collect(Collectors.toList());
		fileWriter.write("List ordered unalphabetic order: \n");
		writeListToFile(orderedUnalphabetic, fileWriter);
	}
	
	public static void uniqueStringsCount(List<String> list, FileWriter fileWriter) throws IOException {
		Long uniqueStrings = list
				.stream()
				.distinct()
				.count();
		fileWriter.write("unique strings count: " + uniqueStrings + "\n");
	}
	
	public static void stringsStartingWithS(List<String> list, FileWriter fileWriter) throws IOException {
		List<String> strinsStartingWithS = list
				.stream()
				.filter(word -> word.startsWith("S"))
				.collect(Collectors.toList());
		fileWriter.write("Strings starting with letter S \n");
		writeListToFile(strinsStartingWithS, fileWriter);
	}
	


	
	
}
