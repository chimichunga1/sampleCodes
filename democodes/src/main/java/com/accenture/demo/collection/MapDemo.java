package com.accenture.demo.collection;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapDemo {

	public static void main(String[] args) {

		/*Map<String, String> map = new TreeMap<String, String>();

		map.put("sap", "Ady");
		map.put("lbm", "Ted");
		map.put("mura", "Mahal");
		map.put("idol", "Buboy");
		map.put("bdayboy", "Kagawad");



//		System.out.println(map.get("sap"));

		Set<String> keys = map.keySet();

		keys.forEach(k -> {

			System.out.print("Map Key: " + k);
			System.out.println(", Map Value: " + map.get(k));
		});*/

		Map<String, Person> map = new TreeMap<String, Person>();

		map.put("sap", new Person("Ady",20));
		map.put("lbm", new Person("Ted", 5));
		map.put("mura", new Person("Mahal", 10));
		map.put("idol", new Person("Buboy", 68));
		map.put("bdayboy", new Person("Kagawad",70));


//		Person person = map.get("sap");
//		System.out.println(person);

		/*Set<String> keys = map.keySet();

		keys.forEach(k -> {

			if ("idol".equals(k)) {
				System.out.print("Map Key: " + k);
				System.out.println(", Map Value: " + map.get(k));
			}
		});*/

		Collection<Person> values = map.values();
		values.forEach(v -> {
			System.out.println(v);
		});

	}

}
