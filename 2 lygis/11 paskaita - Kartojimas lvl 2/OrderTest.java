import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class OrderTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	
	@Test
	public void filterOrderByTypeTest() {
		
		Order order1 = new Order("Nr1", null, OrderType.Purchase);
		Order order2 = new Order("Nr2", null, OrderType.Purchase);
		Order order3 = new Order("Nr3", null, OrderType.Purchase);
		Order order4 = new Order("Nr4", null, OrderType.Purchase);
		Order order5 = new Order("Nr5", null, OrderType.Sale);
		Order order6 = new Order("Nr6", null, OrderType.Sale);
		
		List<Order> orders = new ArrayList<>(Arrays.asList(order1,order2,order3,order4,order5,order6));
		
		
		assertEquals(4, Order.filterOrderByType(orders, OrderType.Purchase).size());
		
		assertEquals(2, Order.filterOrderByType(orders, OrderType.Sale).size());	
		
		
	}
	
	

}
