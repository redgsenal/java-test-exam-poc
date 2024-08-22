package com.exam.generics;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		doGenObjTest();
	}
	
	public static void doGenObjTest() {
		GenObj<String> gobj = new GenObj<String>("Hello World");
		gobj.showObType();
		gobj.showObj();
		
		GenObj<Integer> gobj2 = new GenObj<Integer>(100);
		gobj2.showObType();
		gobj2.showObj();
	}

	public static void showSomeList() {
		List<Integer> list = new LinkedList<Integer>();
		list.add(1);
		list.add(100);
		list.add(320);
		list.add(512);
		list.add(87);
		list.add(47);
		Iterator<Integer> it = list.iterator();
		/*
		 * while(it.hasNext()) { System.out.println(it.next()); }
		 */
		it.forEachRemaining(System.out::println);
	}

}
