package restoms.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import restoms.dao.OmsOrder;
import restoms.dao.OrderRepository;
import restoms.model.NewOrder;

import java.util.UUID;

@Service
public class OrderServiceImpl implements OrderService{

	
	@Autowired
    private OrderRepository repository;
	
	//Map<String, Order> orders;
	public String createOrder(NewOrder norder) {
		/*OmsOrder o = new OmsOrder("100", "amzn", 4, 200, "A","bharat",
				"bh@gh.com");*/

		OmsOrder o = new OmsOrder();
		  o.setDirection(norder.getDirection()); o.setEmail(norder.getEmail());
		  o.setPrice(norder.getPrice()); o.setQuantity(norder.getQuantity());
		  o.setUserName(norder.getUserName()); o.setTicker(norder.getTicker()); String
		  orderId = UUID.randomUUID().toString(); o.setOrderId(orderId);
OmsOrder or=repository.save(o);
		/*
		 * if (orders == null) { orders = new HashMap<String, Order>();
		 * orders.put(orderId, o); }
		 */
		return or.getOrderId();
		
	}
	@Override
	public OmsOrder getOrder(String orderId) {
		
		return repository.findById(orderId).get();
		
		/*if (orders.containsKey(orderId)) {
			return  orders.get(orderId);
		}
		return null;
		}*/
	}
	
}


