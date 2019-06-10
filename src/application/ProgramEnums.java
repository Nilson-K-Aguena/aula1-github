package application;

import java.util.Date;

import entities.OrderEnums;
import entities.enums.OrderStatus;

public class ProgramEnums {

	public static void main(String[] args) {
		OrderEnums orderEnums = new OrderEnums(1080, new Date(), OrderStatus.PENDING_PAYMENT);
		
		System.out.println(orderEnums);
		
		OrderStatus os1 = OrderStatus.DELIVERED;
		OrderStatus os2 = OrderStatus.valueOf("DELIVERED");
		
		System.out.println(os1);
		System.out.println(os2);
	}

}