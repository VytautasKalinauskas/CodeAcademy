import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class Order {

	private String orderNr;
	private HashMap<String, Integer> orderedProducts;
	private OrderType type;

	public Order(String orderNr, HashMap<String, Integer> orderedProducts, OrderType type) {
		super();
		this.orderNr = orderNr;
		this.orderedProducts = orderedProducts;
		this.type = type;
	}
	
	public String getOrderNr() {
		return orderNr;
	}
	public void setOrderNr(String orderNr) {
		this.orderNr = orderNr;
	}
	public HashMap<String, Integer> getOrderedProducts() {
		return orderedProducts;
	}
	public void setOrderedProducts(HashMap<String, Integer> orderedProducts) {
		this.orderedProducts = orderedProducts;
	}
	public OrderType getType() {
		return type;
	}
	public void setType(OrderType type) {
		this.type = type;
	}
	
	
	public static List<Order> filterOrderByType(List<Order> orders, OrderType type) {
		
		List<Order> filteredOrders = orders
				.stream()
				.filter(order -> order.getType().equals(type))
				.collect(Collectors.toList());
		
		return filteredOrders;
		
	}
	
}
