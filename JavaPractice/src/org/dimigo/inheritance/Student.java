/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 *  org.dimigo.inheritance
 *  |_Student
 * 1. 개요 :
 * 2. 작성일 : 2017. 4. 21.
 * </pre>
 *
 * @author JunhaKim
 * @version : 1.0
 */
public class Student extends Person{

	private String studentId;
	
	public Student(String name, int age, int height, int weight, String studentId){
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		this.studentId = studentId;
	}
	
	public void study(){
		System.out.println(name + "가 공부를 한다.");
	}
	public void eatSnack(){
		System.out.println(name + "가 과자를 먹는다.");
	}

	public String toString() {
		return "Student [studentId=" + studentId + ", name=" + name + ", age=" + age + ", height=" + height
				+ ", weight=" + weight + "]";
	}
	
	
}
