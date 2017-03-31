/**
 * 
 */
package org.dimigo.oop;

import java.io.InputStream;
import java.util.Scanner;

/**
 * <pre>
 *  org.dimigo.oop
 *  |_Question
 * 1. 개요 :
 * 2. 작성일 : 2017. 3. 31.
 * </pre>
 *
 * @author JunhaKim
 * @version : 1.0
 */
public class Question {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		String[] answers = {"빅뱅","조인성","응용 프로그래밍"};
		String[] questions = {"1. 가장 좋아하는 가수는?","2. 가장 좋아하는 배우는?","3. 가장 좋아하는 과목은?"};
		for(int i = 0;i<3;i++)
		{
			System.out.println(questions[i]);
			String answer = scanner.nextLine();
			if(answer.equals(answers[i]) == true)
			{
				System.out.println("정답입니다!");
			}
			else
			{
				System.out.println("틀렸습니다!");
			}
		}
		System.out.println("<< 결과 출력>>");
		for(int i=0;i<3;i++)
		{
			System.out.println(questions[i] +" "+ answers[i] +"입니다.");
		}
	}
	

}
