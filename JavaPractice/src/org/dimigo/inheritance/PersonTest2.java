/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 *  org.dimigo.inheritance
 *  |_PersonTest
 * 1. 개요 :
 * 2. 작성일 : 2017. 4. 21.
 * </pre>
 *
 * @author JunhaKim
 * @version : 1.0
 */
public class PersonTest2 {

	/**
	 * @param args
	 */

	private static void greeting(Person p) {
		System.out.println(p.toString());
		p.sayHello();
		p.sayBye();
		System.out.println();
	}

	public static void main(String[] args) {

		Person[] p = { new Person("Tom"), new Korean("홍길동"), new Japanese("다나카"), new Chinese("왕밍"),

		};

		for (int i = 0; i < 4; i++) {
			greeting(p[i]);
		}

	}

}
