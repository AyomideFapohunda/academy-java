package com.bptn.course.statickeyword;

/*
 * Static means that a member of class (attribute or method) belongs to the class
 * not to the instance
 */

public class StaticKeyword {
	static int num; //static
	String str; //non-static
	
	static int addNumbers(int a, int b) {
		
		return a + b;
	}

}
