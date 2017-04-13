/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 *  org.dimigo.oop
 *  |_CalculatorTest
 * 1. 개요 :
 * 2. 작성일 : 2017. 4. 12.
 * </pre>
 *
 * @author JunhaKim
 * @version : 1.0
 */
public class CalculatorTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1 = 10;
		int num2 = 20;
		
		Calculator calc = new Calculator(num1, num2);
		calc.powerOn();
		System.out.println(calc.add());
		System.out.println(calc.sub());
		System.out.println(calc.mul());
		System.out.println(calc.div());
		calc.powerOff();
		
	}

}
