package soapclient;

import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import me.bhargavramreddysanagala.CustomerOrders;
import me.bhargavramreddysanagala.CustomerOrdersPortType;
import me.bhargavramreddysanagala.GetOrderRequest;
import me.bhargavramreddysanagala.GetOrderResponse;
import me.bhargavramreddysanagala.Order;
import me.bhargavramreddysanagala.Product;

public class CustomerOrdersWsClient {

	public static void main(String[] args) {
		try {
			CustomerOrders service = new CustomerOrders(new URL("http://localhost:8080/topdownws/services/customerOrders?wsdl"));
			CustomerOrdersPortType port = service.getCustomerOrdersSOAPPort();
			
			GetOrderRequest request = new GetOrderRequest();
			request.setCustomerid(BigInteger.valueOf(1));
			
			GetOrderResponse orderResponse = port.getOrders(request);
			List<Order> orders = orderResponse.getOrder();
			
			for (Order order : orders) {
				Product product = order.getProduct();
				System.out.println(product.getId());
				System.out.println(product.getDescription());
			}
			
		} catch (MalformedURLException e) {
			
			e.printStackTrace();
		}
		

	}

}
