
public class GenericsTest<T extends Number> {

	
	private T object;
	
	public GenericsTest(T objectParam) {
		object = objectParam;

	}
	
	public T getObject() {
		return object;
	}
	
	public void print() {
		System.out.println("Object is of type: " + object.getClass() + " its value is: " + object);
	}
	
	
	
}
