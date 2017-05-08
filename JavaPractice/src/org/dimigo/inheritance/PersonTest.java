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
public class PersonTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Person per = new Person("Tom");
		Korean kor = new Korean("홍길동");
		Japanese jap = new Japanese("다나카");
		Chinese chi = new Chinese("왕밍");
		
		System.out.println(per.toString());
		System.out.println(kor.toString());
		System.out.println(jap.toString());
		System.out.println(chi.toString());
		System.out.println();
		
		per.sayHello();
		kor.sayHello();
		jap.sayHello();
		chi.sayHello();
		System.out.println();
		
		per.sayBye();
		kor.sayBye();
		jap.sayBye();
		chi.sayBye();
	}

}
