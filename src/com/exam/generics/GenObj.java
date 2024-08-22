package com.exam.generics;

public class GenObj<T> {

	private T ob;

	public GenObj(T o) {
		ob = o;
	}

	public T getOb() {
		return ob;
	}
	
	public void showObj() {
		System.out.println(this.ob);
	}

	public void showObType() {
		System.out.println(this.ob.getClass().getName());
	}
}
