/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 *  org.dimigo.basic
 *  |_CarTest
 * 1. 개요 :
 * 2. 작성일 : 2017. 3. 23.
 * </pre>
 *
 * @author JunhaKim
 * @version : 1.0
 */
public class CarTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		Car info = new Car();
		
		System.out.println("<< 자동차 목록 >>");
		System.out.println("제조사명 : "+ info.company);
		System.out.println("색상 : "+info.color);
		System.out.println("최대속도 : "+info.maxSpeed+"km");
		System.out.println("가격 : " + String.format("%,d", info.price)+"원");
	
		info.setCompany("기아자동차");
		info.setModel("K7");
		info.setcolor("흰색");
		info.setMaxSpeed(246);
		info.setPrice(40000000);
		
		System.out.println("");
		System.out.println("제조사명 : "+ info.company);
		System.out.println("색상 : "+info.color);
		System.out.println("최대속도 : "+info.maxSpeed+"km");
		System.out.println("가격 : " + String.format("%,d", info.price)+"원");
		
		info.setCompany("삼성자동차");
		info.setModel("SM7");
		info.setcolor("회색");
		info.setMaxSpeed(200);
		info.setPrice(38000000);
		
		System.out.println("");
		System.out.println("제조사명 : "+ info.company);
		System.out.println("색상 : "+info.color);
		System.out.println("최대속도 : "+info.maxSpeed + "km");
		System.out.println("가격 : " + String.format("%,d", info.price)+"원");
		
		
	}

}
