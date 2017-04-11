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
public class MultiArray {

	
	public void printArr(int[][] intArr)
	{
		for(int i=0;i<intArr.length; i++)
		{
			for(int j=0;j<intArr[i].length; j++)
			{
				System.out.print(intArr[i][j] + "|");
			}
			System.out.println();
		}
	}
	
	public void printArr(String[][] strArr)
	{
		for(int i=0;i<strArr.length; i++)
		{
			for(int j=0;j<strArr[i].length; j++)
			{
				System.out.print(strArr[i][j] + "|");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		int [][] intArr = new int[2][3];
		MultiArray obj = new MultiArray();
		intArr[0][2] = 1;
		obj.printArr(intArr);
		
		String[][] strArr = new String[2][];
		strArr[0] = new String[3];
		strArr[1] = new String[2];
		System.out.println();
		obj.printArr(strArr);
		System.out.println();
		strArr[0][0] = "ste";
		
		obj.printArr(strArr);
		
		int[][] intArr2 = {
				{1,2,3},
				{4,5,6},
				};
		System.out.println();
		obj.printArr(intArr2);
		
		obj.printArr(intArr2);
		}
}
