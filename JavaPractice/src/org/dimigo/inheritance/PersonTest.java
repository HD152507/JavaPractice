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
		Person person = new Person("주현도", 18, 178, 65);
		System.out.println(person);
		person.eat();
		person.sleep();

		Student student = new Student("주동명", 17, 178, 65, "2534");
		System.out.println(student);

		student.eat();
		student.sleep();
		student.study();
		student.eatSnack();
	}

}
