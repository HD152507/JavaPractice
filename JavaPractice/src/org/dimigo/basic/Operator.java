/**
 * 
 */
package org.dimigo.basic;

/**
 * <pre>
 *  org.dimigo.basic
 *  |_Operator
 * 1. 개요 :
 * 2. 작성일 : 2017. 3. 14.
 * </pre>
 *
 * @author JunhaKim
 * @version : 1.0
 */
public class Operator 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int money = 1700000;
		int user = 3;
		int market = 1500;
		long all = (long)money*12*user*market;
		String.format("%,d", 10000);
		System.out.println("<< 디미베네 연간 인건비 >>");
		System.out.println("월 평균 급여 : " + String.format("%,d", money) + "원");
		System.out.println("점포 내 직원 수 : " + String.format("%,d", user) + "명");
		System.out.println("점포 수 : " + String.format("%,d", market) + "개");
		System.out.println("연간 인건비 : "+ String.format("%,d", all) +"원");
	}

}
