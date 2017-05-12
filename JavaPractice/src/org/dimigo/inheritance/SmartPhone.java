/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 *  org.dimigo.inheritance
 *  |_SmartPhone
 * 1. 개요 :
 * 2. 작성일 : 2017. 5. 12.
 * </pre>
 *
 * @author JunhaKim
 * @version : 1.0
 */
public class SmartPhone {

	private String model;
	private String company;
	private int price;

	public SmartPhone() {

	}

	public SmartPhone(String model, String company, int Price) {
		this.model = model;
		this.company = company;
		this.price = price;
	}

	public void turnOn() {

	}

	public void turnOff() {

	}

	public void pay() {

	}

	public void useSpecialFunction(SmartPhone phone) {

	}

	public String toString() {
		return "모델명 : " + model + ",제조사 : " + company + ",가격 : " + price + "원";
	}
}
