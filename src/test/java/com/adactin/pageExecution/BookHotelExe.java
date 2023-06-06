package com.adactin.pageExecution;

import org.openqa.selenium.WebElement;

import com.adactin.locators.BookHotelLocator;
import ins.aiite.baseclass.BaseClass;

public class BookHotelExe extends SelectHotelExe{
	public static void firstName() {
		BaseClass.send_Keys(BaseClass.get_Element_By(BookHotelLocator.firstName), BaseClass.readSingleValue(1,8,"Sheet1"));
	}
	public static void lastName() {
		BaseClass.send_Keys(BaseClass.get_Element_By(BookHotelLocator.lastName), BaseClass.readSingleValue(1,9,"Sheet1"));
	}
	public static void address() {
		BaseClass.send_Keys(BaseClass.get_Element_By(BookHotelLocator.address), BaseClass.readSingleValue(1,10,"Sheet1"));
	}
	public static void creditCardNum() {
		BaseClass.send_Keys(BaseClass.get_Element_By(BookHotelLocator.creditCardNum), BaseClass.readSingleValue(1,11,"Sheet1"));
	}
	public static void creditCardType() {
		WebElement creditCardType=BaseClass.get_Element_By(BookHotelLocator.creditCardType);
		BaseClass.get_element_to_click(creditCardType);	
		BaseClass.selectEvents(creditCardType);
		BaseClass.selectByVisibleTextOption(readSingleValue(1,12,"Sheet1"));
	}
	public static void expiryMonth() {
		WebElement expireMonth=BaseClass.get_Element_By(BookHotelLocator.expiryMonth);
		BaseClass.get_element_to_click(expireMonth);
		BaseClass.selectEvents(expireMonth);
		BaseClass.selectByVisibleTextOption(readSingleValue(1,13,"Sheet1"));
	}
	public static void expiryYear() {
		WebElement yearElement=BaseClass.get_Element_By(BookHotelLocator.expiryYear);
		BaseClass.get_element_to_click(yearElement);
		BaseClass.selectEvents(yearElement);
		BaseClass.selectByVisibleTextOption(readSingleValue(1,14,"Sheet1"));
	}
	public static void cvv() {
		BaseClass.send_Keys(BaseClass.get_Element_By(BookHotelLocator.cvv),BaseClass.readSingleValue(1,15,"Sheet1"));
	}
	public static void bookNowBtn() {
		BaseClass.get_element_to_click(BaseClass.get_Element_By(BookHotelLocator.bookNowBtn));
		}
	public static void implicitWait(){
		BaseClass.implicitWait(5000);
	}
	public static void orderNumber() {
		WebElement orderNoEle=BaseClass.get_Element_By(orderNo);
		String order_No=BaseClass.getAttribute(orderNoEle);
		BaseClass.excelWrite(order_No,"sheet2");
		System.out.println("OrderNo :" +order_No);
	}
}
