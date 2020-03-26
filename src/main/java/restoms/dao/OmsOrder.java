
package restoms.dao;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity

@Table(name = "OrderDetails")
public class OmsOrder implements Serializable {

	@Id
	private String orderId;
	private String ticker;
	private int quantity;
	private int price;
	private String direction;
	private String userName;
	private String email;

	
	
	public OmsOrder(String orderId, String ticker, int quantity, int price, String direction, String userName,
			String email) {
		super();
		this.orderId = orderId;
		this.ticker = ticker;
		this.quantity = quantity;
		this.price = price;
		this.direction = direction;
		this.userName = userName;
		this.email = email;
	}

	public OmsOrder() {
		super();
	}

	public String getTicker() {
		return ticker;
	}

	public void setTicker(String ticker) {
		this.ticker = ticker;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getDirection() {
		return direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	@Override
	public String toString() {
		return "OmsOrder [orderId=" + orderId + ", ticker=" + ticker + ", quantity=" + quantity + ", price=" + price
				+ ", direction=" + direction + ", userName=" + userName + ", email=" + email + "]";
	}

}
