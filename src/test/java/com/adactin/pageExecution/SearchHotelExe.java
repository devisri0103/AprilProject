package com.adactin.pageExecution;

import org.openqa.selenium.WebElement;

import com.adactin.locators.SearchHotelLocators;

import ins.aiite.baseclass.BaseClass;

public class SearchHotelExe extends LoginPageExe {
	public static void location() {
		WebElement locationElement = BaseClass.get_Element_By(SearchHotelLocators.location);
		BaseClass.get_element_to_click(locationElement);
		BaseClass.selectEvents(locationElement);
		BaseClass.selectByVisibleTextOption(readSingleValue(1,0,"Sheet1"));
}
	public static void hotels() {
		WebElement hotelElement=BaseClass.get_Element_By(SearchHotelLocators.hotels);
		BaseClass.get_element_to_click(hotelElement);
		BaseClass.selectEvents(hotelElement);
		BaseClass.selectByVisibleTextOption(readSingleValue(1,1,"Sheet1"));
	}
	public static void roomType() {
		WebElement roomElement=BaseClass.get_Element_By(SearchHotelLocators.roomType);
		BaseClass.get_element_to_click(roomElement);
		BaseClass.selectEvents(roomElement);
		BaseClass.selectByVisibleTextOption(readSingleValue(1,2,"Sheet1"));
	}
	public static void noofRooms() {
		WebElement roomNumElement=BaseClass.get_Element_By(SearchHotelLocators.noofRooms);
		BaseClass.get_element_to_click(roomNumElement);
		BaseClass.selectEvents(roomNumElement);
		BaseClass.selectByVisibleTextOption(readSingleValue(2,3,"Sheet1"));
	}
	public static void checkIn() {
		BaseClass.send_Keys(BaseClass.get_Element_By(SearchHotelLocators.checkIn), BaseClass.readSingleValue(1,4,"Sheet1"));
	}
	public static void checkOut() {
		BaseClass.send_Keys(BaseClass.get_Element_By(SearchHotelLocators.checkOut), BaseClass.readSingleValue(1,5,"Sheet1"));
	}
	public static void adults() {
		WebElement adultsPerRoomEle=BaseClass.get_Element_By(SearchHotelLocators.adults);
		BaseClass.get_element_to_click(adultsPerRoomEle);
		BaseClass.selectEvents(adultsPerRoomEle);
		BaseClass.selectByVisibleTextOption(readSingleValue(2,6,"Sheet1"));
	}
	public static void children() {
		WebElement childrenPerRoomEle=BaseClass.get_Element_By(SearchHotelLocators.children);
		BaseClass.get_element_to_click(childrenPerRoomEle);
		BaseClass.selectEvents(childrenPerRoomEle);
		BaseClass.selectByVisibleTextOption(readSingleValue(3,7,"Sheet1"));
	}
	public static void search() {
		BaseClass.get_element_to_click(BaseClass.get_Element_By(SearchHotelLocators.search));
	}
	
}