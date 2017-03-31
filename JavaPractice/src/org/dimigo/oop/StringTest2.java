/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 *  org.dimigo.oop
 *  |_StringTest2
 * 1. 개요 :
 * 2. 작성일 : 2017. 3. 31.
 * </pre>
 *
 * @author JunhaKim
 * @version : 1.0
 */
public class StringTest2 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		String str = "디미고";
		str += "2학년";
		str += "5반";
		
		System.out.println(str);

		StringBuilder sb = new StringBuilder("디미고");
		sb.append("2학년 ");
		sb.append("5반");
		sb.append("7번");
		sb.append("김준하");
		
		System.out.println(sb.toString());
		
		
	}


}
