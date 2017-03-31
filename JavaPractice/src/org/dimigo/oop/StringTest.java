/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 *  org.dimigo.oop
 *  |_StringTest
 * 1. 개요 :
 * 2. 작성일 : 2017. 3. 30.
 * </pre>
 *
 * @author JunhaKim
 * @version : 1.0
 */
public class StringTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		
		String dog1 = "해방이";
		String dog2 = "해방이";
		
		System.out.println(dog1.equals(dog2));
		
		String id = "admin";
				
		if (id.equals(id))
		{
			System.out.println("관리자");
		}
		else 
		{
			System.out.println("일반사용자");
		}
	}

}
