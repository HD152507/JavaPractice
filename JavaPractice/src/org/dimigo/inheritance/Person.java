/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 *  org.dimigo.inheritance
 *  |_Person
 * 1. 개요 :
 * 2. 작성일 : 2017. 4. 21.
 * </pre>
 *
 * @author JunhaKim
 * @version : 1.0
 */
public class Person {

	public String name;
	public int age;
	public int height;
	public int weight;

	public Person() {

	}

	public Person(String name, int age, int height, int weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		
	}

	public void eat() {
		System.out.println(name + "가 먹는다.");
	}

	public void sleep() {
		System.out.println(name + "가 잔다.");
	}

	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", height=" + height + ", weight=" + weight + "]";
	}
}
