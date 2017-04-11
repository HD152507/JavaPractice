/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 *  org.dimigo.oop
 *  |_MultiArray
 * 1. 개요 :
 * 2. 작성일 : 2017. 4. 7.
 * </pre>
 *
 * @author JunhaKim
 * @version : 1.0
 */
public class IdolGroup {
	public void printMember(String[][] strArr)
	{
		for(int i=0;i<strArr.length; i++)
		{
			for(int j=0;j<strArr[i].length; j++)
			{
				System.out.print(strArr[i][j]);
				System.out.println();
			}
			System.out.println();
		}
	}
	
	public void printGroup(String[][] strArr)
	{
		for(int i=0;i < groupName.length; i++)
		{
			System.out.print(strArr[i]);
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		
		IdolGroup obj = new IdolGroup();
		String[] groupName = {"빅뱅","2NE1","걸스데이"};
		String[][] memberName = {
				{"GD","태양","대성","탑","승리"},
				{"CL","산다라박","박봄","민지"},
				{"유라","해리","소진","민아"}
		};
		
		obj.printMember(memberName);
	}
}
