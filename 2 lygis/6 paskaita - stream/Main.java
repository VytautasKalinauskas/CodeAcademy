import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {
	
	public static void main(String[] args) {
		
		List<Integer> numbers = new ArrayList<>(Arrays.asList(4,9,6,2,6,5,4));
		numbers = numbers
		.stream()
		.filter(number -> number % 2 == 0)
		.collect(Collectors.toList());
		
		
		List<String> words = new ArrayList<>(Arrays.asList("Zodis", "Zodis2", "HAHA", "PIRMADIENIS"));
		List<String> wordsStartingWithZ = words
				.stream()
				.filter(word -> word.startsWith("Z"))
				.collect(Collectors.toList());
		
		 Long numberWordsWithZ = words
				.stream()
				.filter(word -> word.startsWith("Z"))
				.count();
		 
		 		Optional<String> optionalString = words
				 .stream()
				 .filter(e -> e.startsWith("Z"))
				 .peek(e -> System.out.println(e))
				 .filter(e -> e.length() == 8)
				 .peek(e -> System.out.println(e))
				 .findFirst();
		 
		 
		 		System.out.println("EXECUTED");
		 

		 		List<String> strList = Arrays.asList("abc", "", "bcd", "", "defg", "jk");
		 
		 		Long emptyStringsCount = strList
		 				.stream()
		 				.filter(word -> word.isBlank())
		 				.count();
		 				
		 		System.out.println("empty strings: " + emptyStringsCount);
		 
		 
		 		Long LongerThan3 = strList
		 				.stream()
		 				.filter(word -> word.length() > 3)
		 				.count();
		 
		 		System.out.println("longer than 3: " + LongerThan3);
		 		
		 		Long startsWithA = strList
		 				.stream()
		 				.filter(word -> word.startsWith("a"))
		 				.count();
		 
		 		System.out.println("starts with a: " + startsWithA);
		 		
		 		List<String> nonEmptyWords = strList
		 				.stream()
		 				.filter(word -> !word.isBlank())
		 				.collect(Collectors.toList());
		 		
		 		
		 		List<String> LongerThan2 = strList
		 				.stream()
		 				.filter(word -> word.length() > 2)
		 				.collect(Collectors.toList());
		 		
		 
		 		List<String> numbersString = numbers
		 				.stream()
		 				.map(number -> String.valueOf(number))
		 				.collect(Collectors.toList());
		 		
		 		List<Integer> addOneForEveryNumber = numbers
		 				.stream()
		 				.map(number -> number = number +1)
		 				.collect(Collectors.toList());
		 		
		 		
		 		List<String> capitalLetters = strList
		 				.stream()
		 				.map(word -> word.toUpperCase())
		 				.collect(Collectors.toList());
		 		
		 		Long distinctElementsCount = strList
		 				.stream()
		 				.distinct()
		 				.count();
		 		
		 		boolean ExistsElementWithLength4 = strList
		 				.stream()
		 				.anyMatch(word -> word.length() == 4);
		 		
		 		List<String> orderedList = strList
		 				.stream()
		 				.sorted()
		 				.collect(Collectors.toList());
		 		
		 		List<String> orderedListReversed = strList
		 				.stream()
		 				.sorted(Comparator.reverseOrder())
		 				.collect(Collectors.toList());
		 		
		 		
		 		List<Integer> numbersSquares = numbers
		 				.stream()
		 				.map(number -> number = number*number)
		 				.collect(Collectors.toList());
		 		
		 		boolean allNumbersHigherThan5 = numbers
		 				.stream()
		 				.allMatch(number -> number > 5);
		 		
		 		List<Integer> evenAndLargerThan5Numbers = numbers
		 				.stream()
		 				.filter(number -> number > 5 && number % 2 == 0)
		 				.collect(Collectors.toList());
		 		
		 		Optional<Integer> largestNumber = numbers
		 				.stream()
		 				.sorted(Comparator.reverseOrder())
		 				.findFirst();
		 		
		 		Optional<Integer> lowestNumber = numbers
		 				.stream()
		 				.sorted()
		 				.findFirst();
		 		
		 		List<String> numbersStringWithWord = numbers
		 				.stream()
		 				.map(number -> "Number " + number.toString())
		 				.collect(Collectors.toList());
		 		
		 		
		 		Student Tomas = new Student("Tomas", Subject.MATH, new ArrayList<>(Arrays.asList(9,9,4,8,9,6)));
		 		Student Romas = new Student("Romas", Subject.LITERATURE, new ArrayList<>(Arrays.asList(4,4,6,9)));
		 		Student Rokas = new Student("Rokas", Subject.IT, new ArrayList<>(Arrays.asList(8,8,8,8,8,8)));
		 		Student Rokass = new Student("Rokas", Subject.PHYSICS, new ArrayList<>(Arrays.asList(7,7,9,5,6,5)));
		 		Student Margarita = new Student("Margarita", Subject.LITERATURE, new ArrayList<>(Arrays.asList(10,9,9,8,10)));
		 		
		 		List<Student> group = new ArrayList<>(Arrays.asList(Tomas, Romas, Rokas, Rokass, Margarita));
		 		
		 		
		 		boolean studentTomasExists = group
		 				.stream()
		 				.anyMatch(student -> student.getName().equals("Tomas"));
		 		
		 		
		 		Long studentsFavoriteSubjectIT = group
		 				.stream()
		 				.filter(student -> student.getFavoriteSubject().equals(Subject.IT))
		 				.count();
		 		
		 		
		 		List<String> uniqueStudentNames = group
		 				.stream()
		 				.map(student -> student.getName())
		 				.distinct()
		 				.collect(Collectors.toList());
		 		
		 		List<Student> sortedStudents = group
		 				.stream()
		 				.sorted(Comparator.comparing(Student::getName, Comparator.naturalOrder()))
		 				.collect(Collectors.toList());
		 		
		 		
		 		List<Student> educatedStudents = group
		 				.stream()
		 				.filter(student -> student.getAverage() > 7)
		 				.peek(student -> System.out.println(student.getName()))
		 				.collect(Collectors.toList());
		 		
		 		
		 		
		
		
		
		
		
		
		
		
		Integer[] numbersArray = new Integer[10];
		
		
	
		//List<Integer> evenNumbers = evenNumbers(numbers);
		
		
		
	}
	
	public static List<Integer> evenNumbers(List<Integer> numbers) {
		
		List<Integer> evenNumbers = new ArrayList<>();
		for(Integer number : numbers) {
			if(number %2 == 0) {
				evenNumbers.add(number);
			}
		}
		
		return evenNumbers;
		
	}

}
