/**
 * 
 */
package org.dimigo.basic;

/**
 * <pre>
 * JavaPractice
 *   └ PrimitiveDataType
 *
 * 1. 개요 : 아이유 프로필
 * 2. 작성일 : 2017. 3. 9.
 * </pre>
 *
 * @author : sun90
 * @version : 1.0
 */
public class PrimitiveDataType 
{

	public static void main(String[] args) 
	{

		System.out.println("<<아이유 프로필>>");

		String name = "아이유";
		System.out.println("이름 : " + name);

		boolean isMale = false;
		System.out.print("성별 : ");
		System.out.println(isMale ? "남자" : "여자");

		int age = 25;
		System.out.print("나이 : ");
		System.out.println(age + "세");

		double height = 161.8;
		System.out.print("키 : ");
		System.out.println(height + "cm");

		float weight = 44.3F;
		System.out.print("몸무게 : ");
		System.out.println(weight + "kg");

		char bloodType = 'A';
		System.out.print("혈액형 : ");
		System.out.println(bloodType + "형");

	}
}
