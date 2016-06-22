package me.bhargav;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import me.bhargavramreddysanagala.*;
public class CustomersOrdersWSImpl implements CustomerOrdersPortType {

	Map<BigInteger, List<Order>> customerOrders = new HashMap<>();
	int currentCustomerId;

	public CustomersOrdersWSImpl() {
		init();
	}

	public void init() {
		List<Order> orders = new ArrayList<Order>();
		Order order = new Order();
		order.setId(BigInteger.valueOf(1));
		Product product = new Product();
		product.setDescription("HTC ONE V");
		product.setId("1");
		product.setQuantity(BigInteger.valueOf(3));

		order.setProduct(product);

		orders.add(order);
		customerOrders.put(BigInteger.valueOf(++currentCustomerId), orders);
	}

	@Override
	public GetOrderResponse getOrders(GetOrderRequest request) {
		BigInteger customerId = request.getCustomerid();
		List<Order> orders = customerOrders.get(customerId);
		
		GetOrderResponse response = new GetOrderResponse();
		List<Order> responseOrders = response.getOrder();
		for(Order order : orders){
			responseOrders.add(order);
		}
		return response;
	}

	@Override
	public CreateOrderResponse createOrders(CreateOrderRequest request) {
		List<Order> orders = customerOrders.get(request.getCustomerid());
		orders.add(request.getOrder());
		CreateOrderResponse createOrderResponse = new CreateOrderResponse();
		createOrderResponse.setResult(true);
		return createOrderResponse;
	}

	

}
