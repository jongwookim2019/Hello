package com.yedam.Generic;



public class BoxExample {
	public static void main(String[] args) {
		
		Box<String> box = new Box<String>();
		box.setObj(new String("hello"));
		String str = box.getObj();
		
		Box<Integer> intbox = new Box<Integer>();
		intbox.setObj(10);
		int value = intbox.getObj();
//		Box box = new Box();
//		box.setObj(new String("Hello"));
//		Object strValue= box.getObj();
//		System.out.println(strValue);
//		box.setObj(new Integer(10));
//		int intBalue = (int) box.getObj();
//		System.out.println(intValue);
//	
//		box.setObj(new Double(1.1));
//		String newStr = (String) box.getObj()
	}
}
