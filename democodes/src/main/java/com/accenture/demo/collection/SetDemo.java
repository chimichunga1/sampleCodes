package com.accenture.demo.collection;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {

		Set<String> set = new HashSet<String>();

		set.add("Ady");
		set.add("Ted");
		set.add("Choks");
		set.add("Buboy");
		set.add("Kagawad");


		/*for(String name : set){
			System.out.println(name);
		}*/

		/*Iterator<String> iterator = set.iterator();

		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}*/

		set.forEach(n -> {
			System.out.println(n);
		});
	}

}
