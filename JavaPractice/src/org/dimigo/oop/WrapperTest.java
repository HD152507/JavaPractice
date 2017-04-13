/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 *  org.dimigo.oop
 *  |_WrapperTest
 * 1. 개요 :
 * 2. 작성일 : 2017. 4. 11.
 * </pre>
 *
 * @author JunhaKim
 * @version : 1.0
 */
public class WrapperTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		
		
		
		
//		System.out.println(Integer.MAX_VALUE);
//		System.out.println(Integer.MIN_VALUE);
//		System.out.println(Integer.SIZE);
//		
//		System.out.println(Integer.toString(100));
//		System.out.println(Integer.toBinaryString(10));
//		System.out.println(Integer.toHexString(10));
//		
//		Integer obj1 = new Integer(100);
//		Integer obj2 = new Integer("100");
//		
//		System.out.println(obj1 == obj2);
//		System.out.println(obj1.equals(obj2));
//		
//		System.out.println(obj1.intValue() == obj2.intValue());
		
		Integer obj3 = Integer.valueOf(100);
		Double obj4 = Double.valueOf(3.141592);
		
		
		System.out.println(obj4.doubleValue() == 3.141592);

		
		Integer obj5 = new Integer(1000);
		Integer obj6 = new Integer(2000);
		
		Integer result = obj5 + obj6;
		System.out.println(result);
		
		Integer obj7 = 1000;
		int i = obj7 + 100;
		System.out.println(i);
		
		Integer n1 = 10;
		Integer n2 = n1 + 20;
		Integer result2 = n1 + n2;
	}

}
