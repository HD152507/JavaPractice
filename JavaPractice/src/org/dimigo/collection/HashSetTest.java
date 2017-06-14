/**
 * 
 */
package org.dimigo.collection;

import java.util.HashSet;
import java.util.Set;

/**
 * <pre>
 *  org.dimigo.collection
 *  |_HashSetTest
 * 1. 개요 :
 * 2. 작성일 : 2017. 6. 12.
 * </pre>
 *
 * @author JunhaKim
 * @version : 1.0
 */
public class HashSetTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set = new HashSet<>();
		
		set.add("짜장면");
		set.add("짬뽕");
		set.add("볶음밥");
		set.add("짜장면");
		
		System.out.println(set);

	}

}
