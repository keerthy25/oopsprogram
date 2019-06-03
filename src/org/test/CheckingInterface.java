package org.test;

 interface Check {
	void meth1();
	public abstract void meth2();
}
public class CheckingInterface implements Check
{

	@Override
	public void meth1() {
		System.out.println("method 1");
	}

	@Override
	public void meth2() {
		System.out.println("method 2");
	}
	public static void main(String[] args) {
		CheckingInterface c=new CheckingInterface();
		c.meth1();
		c.meth2();
	}
}
