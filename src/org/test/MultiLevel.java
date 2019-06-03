package org.test;

class Sample1{
	public void meth1() {
		System.out.println("method1");
	}
}
class Sample2 extends Sample1{
	public void meth2() {
		System.out.println("method2");

	}
}
public class MultiLevel extends Sample2{
	public static void main(String[] args) {
		MultiLevel m=new MultiLevel();
		m.meth1();
		m.meth2();
	}
}
