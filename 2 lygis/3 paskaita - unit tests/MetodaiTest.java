import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MetodaiTest {
	
	Metodai metodai;
	ArrayList<Integer> numbers;
	Pica mazaPica, vidutinePica, didelePica;

	@BeforeEach
	void setUpBeforeClass() throws Exception {
		
		metodai = new Metodai();
		numbers = new ArrayList<>(Arrays.asList(65,45,25));
		mazaPica = new Pica(PicuDydziai.MAZAS, 2, 2);
		vidutinePica = new Pica(PicuDydziai.VIDUTINIS, 3,3);
		didelePica = new Pica(PicuDydziai.DIDELIS, 1, 0);
		
	}
	
	@Test
	void smallestNumberTest() throws Exception {
		
		Integer smallestNumber = metodai.smallestNumber(numbers);
		assertEquals(25, smallestNumber);
	}
	
	@Test
	void smallestNumberTestException() {
		
	    assertThrows(
	    		NullPointerException.class, () -> metodai.smallestNumber(new ArrayList<>()),
	            "Expected doThing() to throw, but it didn't"
	     );
		
	}
	
	@Test
	void averageTest() {
		
		Double average = metodai.average(numbers);
		assertEquals(45.00, average);
		
	}
	
	@Test
	void middleCharacterTestOddCharacters() {

		String word = "koncertas";
		assertEquals("e",metodai.middleCharacter(word));
		
	}
	
	@Test
	void middleCharacterTestEvenCharacters() {
		String word = "krabas";
		assertEquals("ab", metodai.middleCharacter(word));
	}
	
	@Test
	void numberOfVowels() {
		String word = "nebeprisikiskiakopusteliaujantiesiems";
		assertEquals(18,metodai.numberOfVowels(word));
	}
	
	@Test
	void monthTestZero() {
		String month = metodai.month(0);
		assertEquals("netinkamas skaicius", month);
	}
	
	@Test
	void monthTestThirteen() {
		String month = metodai.month(13);
		assertEquals("netinkamas skaicius", month);
		
	}
	
	@Test
	void monthTestFebruary() {
		String month = metodai.month(2);
		assertEquals("February", month);
		
	}
	
	@Test
	void monthTestMay() {
		String month = metodai.month(5);
		assertEquals("May", month);
	}
	
	
	@Test
	void testMazaPica() {
		Integer kaina = mazaPica.skaiciuotiKaina();
		assertEquals(19,kaina);
	}
	
	@Test
	void testVidutinePica() {
		Integer kaina = vidutinePica.skaiciuotiKaina();
		assertEquals(24,kaina);
	}
	
	@Test
	void testDidelePica() {
		Integer kaina = didelePica.skaiciuotiKaina();
		assertEquals(16,kaina);
	}
	
	@Test
	void testUzsakymas() {
		ArrayList<Pica> picos = new ArrayList<>(Arrays.asList(mazaPica, vidutinePica, didelePica));
		Uzsakymas uzsakymas = new Uzsakymas("Nr-1", picos);
		
		Integer uzsakymoSuma = uzsakymas.skaiciuotiUzsakymoSuma();
		assertEquals(59, uzsakymoSuma);
		
	}
	
	@Test
	void testUzsakymasTuscias() {
		
		Uzsakymas uzsakymas = new Uzsakymas("Nr-1", new ArrayList<>());
	    assertThrows(
	    		NullPointerException.class, () -> uzsakymas.skaiciuotiUzsakymoSuma());
		
	}
	
	
	

}
