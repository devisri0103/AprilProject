package com.adactin.locators;

import org.openqa.selenium.By;

public class SearchHotelLocators extends LoginPageLocators{
	public static By location=By.id("location");
	public static By hotels=By.id("hotels");
	public static By roomType=By.id("room_type");
	public static By noofRooms=By.name("room_nos");
	public static By checkIn=By.id("datepick_in");
	public static By checkOut=By.id("datepick_out");
	public static By adults=By.id("adult_room");
	public static By children=By.id("child_room");
	public static By search=By.id("Submit");
}