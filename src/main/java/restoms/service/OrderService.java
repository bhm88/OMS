package restoms.service;


import restoms.dao.OmsOrder;
import restoms.model.NewOrder;

public interface OrderService {
	
	public String  createOrder(NewOrder norder);
	public OmsOrder getOrder(String orderId);

}
