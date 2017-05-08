/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 *  org.dimigo.inheritance
 *  |_Dog
 * 1. 개요 :
 * 2. 작성일 : 2017. 4. 26.
 * </pre>
 *
 * @author JunhaKim
 * @version : 1.0
 */
public class Dog extends Animal{
	
	public Dog(String name)
	{
		super(name);
	}
	
	public void bark()
	{
		System.out.println("멍멍");
	}
}
