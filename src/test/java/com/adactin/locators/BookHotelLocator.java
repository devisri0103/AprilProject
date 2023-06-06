package com.adactin.locators;

import org.openqa.selenium.By;

public class BookHotelLocator extends SelectHotelLocators {
public static By firstName=By.id("first_name");
public static By lastName=By.id("last_name");
public static By address=By.id("address");
public static By creditCardNum=By.xpath("//input[@id='cc_num']");
public static By creditCardType=By.name("cc_type");
public static By expiryMonth=By.name("cc_exp_month");
public static By expiryYear=By.id("cc_exp_year");
public static By cvv=By.id("cc_cvv");
public static By bookNowBtn=By.id("book_now");
public static By orderNo=By.xpath("//input[@id='order_no']");

}
