package entities;

import java.util.Date;

import entities.enums.OrderStatus;

public class OrderEnums {
	private Integer id;
	private Date moment;
	private OrderStatus status;
	
	public OrderEnums() {
	}
	
	public OrderEnums(Integer id, Date moment, OrderStatus status) {
		this.id = id;
		this.moment = moment;
		this.status = status;
	}
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public Date getDate() {
		return moment;
	}
	
	public void setDate(Date moment) {
		this.moment = moment;
	}
	
	public OrderStatus getOrderStatus() {
		return status;
	}
	
	public void setOrderStatus(OrderStatus status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "OrderEnums [id=" + id + ", moment=" + moment + ", status=" + status + "]";
	}
	
	
}
