import java.util.ArrayList;
import java.util.Arrays;

public class Warmup {

	public Integer calculatorParser(String text) throws ArithmeticException {
		
		ArrayList<Character> operators = new ArrayList<>(Arrays.asList('+','-','/','*'));
		Character operator = null;
		
		for(Character character : text.toCharArray()) {
			if(operators.contains(character)) {
				operator = character;
				break;
			}
		}
		
		
		Integer digit1 = Integer.parseInt(text.substring(0, text.indexOf(operator)));
		Integer digit2 = Integer.parseInt(text.substring(text.length() - 1));
		
		
		return calculator(digit1, operator, digit2);
	}
	
	public Integer calculator(Integer a, Character sign, Integer b) throws ArithmeticException {
		
		Integer result = null;
		
		switch(sign) {
		case '+':
			return a + b;
		case '-':
			return a-b;
		case '*':
			return a*b;
		case '/':
			if(b == 0) {
				throw new ArithmeticException("dalyba is 0 negalima");
			}
			return a/b;
		default:
			throw new ArithmeticException("Nurodytas netinkamas zenklas");
			
		}

	}
	
	
	public Integer countWords(String text) {
		
		String[] words = text.split(" ");
		return words.length;
		
	}
	
	
}
