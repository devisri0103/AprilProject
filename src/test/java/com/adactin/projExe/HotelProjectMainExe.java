package com.adactin.projExe;

import com.adactin.pageExecution.BookHotelExe;

public class HotelProjectMainExe extends BookHotelExe {

	public static void main(String[] args){
		set_Property("chrome");
		launch_Url(propRead("URL"));
		maxi_window();
		username();
		password();
		login();
		location();
		hotels();
		roomType();
		noofRooms();
		checkIn();
		checkOut();
		adults();
		children();
		search();
		radiobutton();
		continuebutton();
		firstName();
		lastName();
		address();
		creditCardNum();
		creditCardType();
		expiryMonth();
		expiryYear();
		cvv();
		bookNowBtn();
		implicitWait(5000);
		orderNumber();
		close_window();
		
	}
}
