import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		
		Team<BasketballPlayer> zalgiris = new Team<>("Zalgiris");
		Team<BasketballPlayer> rytas = new Team<>("Rytas");
		Team<BasketballPlayer> wolves = new Team<>("Wolves");
		
		BasketballPlayer jankunas = new BasketballPlayer("Jankis", 207, 120.0);
		BasketballPlayer sabonis = new BasketballPlayer("Sabas", 220, 130.0);
		
		zalgiris.addPlayer(sabonis);
		zalgiris.addPlayer(jankunas);
		
		
		zalgiris.playMatch(wolves, 94, 87);
		rytas.playMatch(wolves, 66, 67);
		
		
		Team<FootballPlayer> real = new Team<>("Real Madrid");
		
		FootballPlayer ronaldo = new FootballPlayer("cr7", 187, 87.5);
		FootballPlayer messi = new FootballPlayer("messi", 170, 70.0);
		
		//zalgiris.getByHeight(real);
		
		real.addPlayer(ronaldo);
		real.addPlayer(messi);
		
		
		
		GenericsTest<Double> genericsTestDouble = new GenericsTest<>(2.0);
		genericsTestDouble.print();
		
		GenericsTest<Integer> genericsTestInteger = new GenericsTest<>(4);
		genericsTestInteger.print();
		
		

		Banana banana = new Banana("banana");
		Banana banana2 = new Banana("banana2");
		
		Orange orange = new Orange("orange");
		Orange orange2 = new Orange("orange2");
		
		Apple apple = new Apple("apple");
		Apple apple2 = new Apple("apple2");
		
		FruitSeller<Banana> bananaMan = new FruitSeller<Banana>("bananaman", new ArrayList<>(Arrays.asList(banana, banana2)));
		FruitSeller<Apple> appleMan = new FruitSeller<Apple>("appleman", new ArrayList<>(Arrays.asList(apple, apple2)));
		FruitSeller<Orange> orangeMan = new FruitSeller<Orange>("orangeman", new ArrayList<>(Arrays.asList(orange, orange2)));
		
		bananaMan.sellFruit(banana);
		appleMan.sellFruit(apple);
		orangeMan.sellFruit(orange);
		
		
		FruitSeller<Fruit> fruitSeller = new FruitSeller<Fruit>("FruitSeller", new ArrayList<Fruit>());
		fruitSeller.sellFruit(apple);
		fruitSeller.sellFruit(orange);
		
		FruitSeller<Fruit> fruitSeller2 = new FruitSeller<Fruit>("FruitSeller2", new ArrayList<Fruit>());
		fruitSeller2.sellFruit(banana);
		fruitSeller2.sellFruit(banana);
		
		
		
		fruitSeller.moreFruitsSold(fruitSeller);
		
		
		fruitSeller.moreFruitsSold(fruitSeller2);
		
		
//		ArrayList objects = new ArrayList<>();
//		objects.add(1);
//		objects.add("word");
//		objects.add('C');
//		
//		printObjects(objects);
//		
	}
	
	public static void printObjects(ArrayList arraylist) {
		Integer sum = 0;
		for(Object object : arraylist) {
			System.out.println(object);
			sum += (Integer)object;
		}
	}

}
