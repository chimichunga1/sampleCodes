package com.accenture.demo.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class ListDemo {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();

//		System.out.println(list.size());

		list.add("Ady");
		list.add("Ted");
		list.add("Choks");
		list.add("Buboy");
		list.add("Kagawad");

//		System.out.println(list.size());

		/*for(int i = 0; i < list.size(); i++){
			System.out.println(list.get(i));
		}*/

		/*for(String name : list){
			System.out.println(name);
		}*/

		/*Iterator<String> iterator = list.iterator();

		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}*/

		list.forEach(n -> {
			System.out.println(n);
		});





//		System.out.println(list.get(4));

	}

}
