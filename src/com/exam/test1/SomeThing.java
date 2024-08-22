package com.exam.test1;

import java.util.List;

public class SomeThing {

	private final String property1;
	private final String property2;
	private final int property3;
	private final List<String> property4;

	public SomeThing(String property1, String property2, int property3, List<String> property4) {
		this.property1 = property1;
		this.property2 = property2;
		this.property3 = property3;
		this.property4 = property4;
	}

	public String getProperty1() {
		return property1;
	}

	public String getProperty2() {
		return property2;
	}

	public int getProperty3() {
		return property3;
	}

	public List<String> getProperty4() {
		return property4;
	}
}
