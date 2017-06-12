/**
 * 
 */
package org.dimigo.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <pre>
 *  collection
 *  |_MelonChart
 * 1. 개요 :
 * 2. 작성일 : 2017. 6. 2.
 * </pre>
 *
 * @author JunhaKim
 * @version : 1.0
 */
public class MelonGenreChart {
	public static void main(String[] args) {
		List<Music> list = new ArrayList<Music>();
		
		Map<String, List<Music>> map = new HashMap<>();

		System.out.println("-- << 멜론 장르별 차트 >> --");
		
		map.put("Ballad", list.add("I LUV IT", "PSY"));
	}

	public static void printMap(Map map) {
		System.out.println([map.keySet()] + "/n" + map.values());
	}
}