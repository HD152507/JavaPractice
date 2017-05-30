/**
 * 
 */
package org.dimigo.exception;

/**
 * <pre>
 *  org.dimigo.exception
 *  |_MovieTest
 * 1. 개요 :
 * 2. 작성일 : 2017. 5. 29.
 * </pre>
 *
 * @author JunhaKim
 * @version : 1.0
 */
public class MovieTest {
	public static void main(String[] args) {

		Movie[] movies = {
				new Movie("에이리언:커버넌트", 15),
				new Movie("가디언즈 오브 갤럭시", 12)
		};
		
		int age = 13;
		
		for(Movie movie : movies) {
			movie.buyTicket(age);
			
			if(age > movie.getLimitAge()) {
				try {
					System.out.println("1");
				}
				catch (Exception e) {
					System.out.println("2");
					throw e;
				}
			}
			
		}
	}
}
