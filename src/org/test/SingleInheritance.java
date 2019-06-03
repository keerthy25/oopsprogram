package org.test;

 class Test {
	public void meth1() {
		System.out.println("method1");
	}

}
public class SingleInheritance extends Test{
	public static void main(String[] args) {
		SingleInheritance s=new SingleInheritance();
		s.meth1();
		
	}
}
