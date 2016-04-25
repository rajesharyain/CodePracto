package com.codepracto.collection;

public class PrintNull {

	public PrintNull() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestClass a = new  TestClass();
		a.display(null);
	}

}

class TestClass
{
	public void display(String s){
		System.out.println(s);
	}
	public void display(int i){
		System.out.println(i);
	}
}
