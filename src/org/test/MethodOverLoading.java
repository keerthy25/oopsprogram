package org.test;

public class MethodOverLoading {
	public void meth1() {
		System.out.println("method one");
	}
	public void meth1(int a)
	{
		System.out.println(a);
	}
	public static void main(String[] args) {
		MethodOverLoading m=new MethodOverLoading();
		m.meth1();
		m.meth1(9);
	}
}
