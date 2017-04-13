/**
 * 
 */
package org.dimigo.oop;

import java.util.Arrays;

/**
 * <pre>
 *  org.dimigo.oop
 *  |_ArraysTest
 * 1. 개요 :
 * 2. 작성일 : 2017. 4. 11.
 * </pre>
 *
 * @author JunhaKim
 * @version : 1.0
 */
public class ArraysTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
			String[] src = {"TWICE", "레드벨벳", "주현도", "주동명", "권두영", "Apple"};
			System.out.println(Arrays.toString(src));
			String[] dest = Arrays.copyOf(src, src.length);
			System.out.println(Arrays.toString(dest));
			System.out.println(dest == src);
			System.out.println(Arrays.equals(src, dest));
			
			Arrays.sort(src);
			System.out.println(Arrays.toString(src));
			
			int alnum = Arrays.binarySearch(src, "TWICE");
			System.out.println(alnum);
			System.out.println(Arrays.toString(args));
			
			String num1 = args[0];
			String num2 = args[1];
			System.out.println(num1 + num2);
	}

}
