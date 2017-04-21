/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 *  org.dimigo.inheritance
 *  |_Teacher
 * 1. 개요 :
 * 2. 작성일 : 2017. 4. 21.
 * </pre>
 *
 * @author JunhaKim
 * @version : 1.0
 */
public class Teacher extends Person {
	private String subject;

	public Teacher(String name, int age, int height, int weight, String subject) {
	
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		this.subject = subject;
	}
	
	public void teach() {
		System.out.println(name + "가르친다.");
	}

	public void doTask() {
		System.out.println(name + "일을 한다.");
	}

	public String toString() {
		return "Teacher [subject=" + subject + ", name=" + name + ", age=" + age + ", height=" + height + ", weight="
				+ weight + "]";
	}
	
}
