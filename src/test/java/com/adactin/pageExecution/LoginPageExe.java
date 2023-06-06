package com.adactin.pageExecution;

import com.adactin.locators.BookHotelLocator;
import com.adactin.locators.LoginPageLocators;

import ins.aiite.baseclass.BaseClass;

public class LoginPageExe extends BookHotelLocator {
	
	public static void username(){
		BaseClass.send_Keys(BaseClass.get_Element_By(LoginPageLocators.username), BaseClass.propRead("username"));
	}
	
	public static void password() {
		BaseClass.send_Keys(BaseClass.get_Element_By(LoginPageLocators.password), BaseClass.propRead("password"));
	}
	
	public static void login() {
		BaseClass.get_element_to_click(BaseClass.get_Element_By(LoginPageLocators.login));
	}
}
