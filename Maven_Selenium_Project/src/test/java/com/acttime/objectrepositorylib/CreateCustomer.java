package com.acttime.objectrepositorylib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateCustomer {

	@FindBy(name = "name")
	private WebElement customerNAme;

	@FindBy(name = "description")
	private WebElement customerDescEdt;

	@FindBy(xpath = "//input[@value='Create Customer']")
	private WebElement createCustomerBtn;

	public void createCustomer(String customerName) {
		customerNAme.sendKeys(customerName);
		createCustomerBtn.click();
	}

	public void createCustomer(String customerName, String customerDesc) {
		customerNAme.sendKeys(customerName);
		customerDescEdt.sendKeys(customerDesc);
		createCustomerBtn.click();
	}
}
