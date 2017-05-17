/**
 * 
 */
package org.dimigo.abstractclass;

/**
 * <pre>
 *  org.dimigo.abstractclass
 *  |_AnimalTest
 * 1. 개요 :
 * 2. 작성일 : 2017. 5. 16.
 * </pre>
 *
 * @author JunhaKim
 * @version : 1.0
 */
public class AnimalTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animal[] animals = { new Cow(), new Duck(), };

		System.out.println("평온한 동물농장");

//		for (Animal a : animals) {
//			a.eat();
//		}

		for (Animal a : animals) {
			a.bark();
		}
	}

}
