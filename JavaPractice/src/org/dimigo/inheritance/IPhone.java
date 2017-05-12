/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 *  org.dimigo.inheritance
 *  |_IPhone
 * 1. 개요 :
 * 2. 작성일 : 2017. 5. 12.
 * </pre>
 *
 * @author JunhaKim
 * @version : 1.0
 */
public class IPhone extends SmartPhone {

	public IPhone() {

	}

	public IPhone(String model, String company, int price) {

	}

	public void turnOn() {
		System.out.println("iPhone7의 전원을 켭니다.");
	}

	public void turnOff() {
		System.out.println("iPhone 7의 전원을 끕니다.");
	}

	public void pay() {
		System.out.println("애플 페이로 결재합니다.");
	}

}
