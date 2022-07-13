import java.util.ArrayList;
import java.util.Arrays;

public class Metodai {

	public Integer smallestNumber(ArrayList<Integer> numbers) throws Exception {
		
		if(numbers.isEmpty()) {
			throw new NullPointerException("tuscias sarasas");
		}
		
		Integer smallestNumber = numbers.get(0);
		
		for(Integer number : numbers) {
			if(number < smallestNumber) {
				smallestNumber = number;
			}
		}
		
		return smallestNumber;
	}
	
	public Double average(ArrayList<Integer> numbers) {
		
		Double sum = 0.0;
		for(int i = 0; i < numbers.size(); i++) {
			sum += numbers.get(i);
		}
		return sum / numbers.size();
		
	}
	
	public String middleCharacter(String word) {
		
		String character = "";
		if(word.length() % 2 == 0) {
			character = character.concat(String.valueOf(word.charAt(word.length() / 2  - 1)).concat(String.valueOf(word.charAt(word.length() / 2))));
		}
		else {
			character = String.valueOf(word.charAt(word.length() / 2));
		}
		
		return character;
		
	}
	
	public Integer numberOfVowels(String word) {
		
		Integer sum = 0;
		String wordLowerCase = word.toLowerCase();
		ArrayList<Character> vowels = new ArrayList<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'y'));
		
		for(int i = 0; i < wordLowerCase.length(); i++) {
			if(vowels.contains(wordLowerCase.charAt(i))) {
				sum++;
			}
		}
		
		return sum;
		
	}
	
	public String month(Integer numberMonth) {
		
		String month = "";
		
		if(numberMonth > 0) {
			if(numberMonth < 13) {
				if(numberMonth % 2 == 0) {
					switch(numberMonth) {
					case 2:
						month = "February";
						break;
					case 4:
						month = "April";
						break;
					case 6:
						month = "June";
						break;
					case 8:
						month = "August";
						break;
					case 10:
						month = "October";
						break;
					case 12:
						month = "December";
						break;
					}
				}
				
				else {
					switch(numberMonth) {
					case 1:
						month = "January";
						break;
					case 3:
						month = "March";
						break;
					case 5:
						month = "May";
						break;
					case 7:
						month = "July";
						break;
					case 9:
						month = "September";
						break;
					case 11:
						month = "November";
						break;
					}
				}
				
			}
			
			else {
				month = "netinkamas skaicius";
			}
		}
		
		
		else {
			month = "netinkamas skaicius";
		}
		
		return month;
		
		
	}
	
	
}
