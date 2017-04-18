/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 *  org.dimigo.oop
 *  |_Count
 * 1. 개요 :
 * 2. 작성일 : 2017. 4. 18.
 * </pre>
 *
 * @author JunhaKim
 * @version : 1.0
 */
public class Count {

	/**
	 * @param args
	 */
	private static int cnt;
	
	public Count()
	{
		cnt++;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=0; i<10; i++)
		{
			new Count();
		}

	}

}
