package org.test;

interface  Multiple1 {
	public void meth1();

}
interface Multiple2{
	public void meth2();
}
public class MultipleInheritance implements Multiple1,Multiple2{

	@Override
	public void meth2() {
		System.out.println("method1");
		
	}

	@Override
	public void meth1() {
		System.out.println("method 2");
		
	}
	
}