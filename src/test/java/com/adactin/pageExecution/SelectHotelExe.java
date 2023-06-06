package com.adactin.pageExecution;

import com.adactin.locators.SelectHotelLocators;

import ins.aiite.baseclass.BaseClass;

public class SelectHotelExe extends SearchHotelExe{
public static void radiobutton() {	
	BaseClass.get_element_to_click(BaseClass.get_Element_By(SelectHotelLocators.radiobutton));
}
public static void continuebutton() {

BaseClass.get_element_to_click(BaseClass.get_Element_By(SelectHotelLocators.continuebutton));
}
}
