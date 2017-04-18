/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 *  org.dimigo.oop
 *  |_Calculator
 * 1. 개요 :
 * 2. 작성일 : 2017. 4. 12.
 * </pre>
 *
 * @author JunhaKim
 * @version : 1.0
 */
public class Calculator {
	private int num1;
	private int num2;
	private boolean powerFlag;
	
	
	public static double pi = 3.14;
	public Calculator(){
		
	}

	public Calculator(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public void powerOn() {
		if(!this.powerFlag){
		System.out.println("전원을 켭니다.");
		this.powerFlag = true;
		}
	}
	
	public void powerOff() {
		System.out.println("전원을 끕니다.");
	}
	
	public static int add(int a, int b, Calculator calc)
	{
		calc.powerOn();
		return a+b; 
	}
	
	public static int sub(int a, int b, Calculator calc)
	{
		calc.powerOn();
		return a+b;
	}
	
	public static int mul(int a, int b, Calculator calc)
	{
		calc.powerOn();
		return a*b;
	}
	
	public static double div(int a, int b, Calculator calc)
	{
		calc.powerOn();
		return (double)a/b;
	}
}
