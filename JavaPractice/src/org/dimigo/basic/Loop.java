/**
 * 
 */
package org.dimigo.basic;

import java.util.Random;
import java.util.Scanner;
/**
 * <pre>
 *  org.dimigo.basic
 *  |_Loop
 * 1. 개요 :
 * 2. 작성일 : 2017. 3. 15.
 * </pre>
 *
 * @author JunhaKim
 * @version : 1.0
 */
public class Loop 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		int i,j;
		for(i=2;i<=9;i++)
		{
			for(j=1;j<=9;j++)
				System.out.print(i*j+" ");
			System.out.println("");
		}
		
		String[] twice = {"foo","bar","baz","qux","quux"};
		for (String m : twice)
		{
			System.out.println(m);
		}
		Scanner scanner = new Scanner(System.in);
		int choice;
		

		{
			System.out.println("menu");
			System.out.println("1. foo");
			System.out.println("2. bar");
			System.out.println("9. exit");
			System.out.println("select");
			
			choice = scanner.nextInt();
		}
		switch(choice) 
		{
			case 1:
				System.out.println("foo");
				break;
			case 2:
				System.out.println("bar");
				break;
			case 3:
				System.out.println("baz");
				break;
			default:
				System.out.println("no neim");
		}
	}
	
}
