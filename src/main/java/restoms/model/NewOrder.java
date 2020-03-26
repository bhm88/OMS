package restoms.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class NewOrder {
	@NotNull(message = "Ticker can't be null")
	@Size(min=4,max=8,message = "Tickershd be between 4 & 8")
	private String ticker;
	@NotNull(message = "quantity can't be null")
	private int quantity;
	@NotNull(message = "price can't be null")
	private int price;
	@NotNull(message = "direction can't be null")
	@Size(min=1,max=1,message = "direction should be  1 character only")
	private String direction;
	@NotNull(message = "userName can't be null")
	@Size(min=4,max=8,message = "userNamer shd be between 4 & 8")
	private String userName;
	@Email
	@NotNull(message = "email can't be null")
	private String email;
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

	
	
}
