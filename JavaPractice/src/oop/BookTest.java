/**
 * 
 */
package oop;

/**
 * <pre>
 *  oop
 *  |_BookTest
 * 1. 개요 :
 * 2. 작성일 : 2017. 3. 22.
 * </pre>
 *
 * @author JunhaKim
 * @version : 1.0
 */
public class BookTest {

	public static void main(String[] args)
	{
		Book book = new Book();
		
		System.out.println(book.title);
		System.out.println(book.author);
		System.out.println(book.page);
		
		Book book2 = new Book();
		
		System.out.println(book2.title);
		System.out.println(book2.author);
		System.out.println(book2.page);
	}
}
