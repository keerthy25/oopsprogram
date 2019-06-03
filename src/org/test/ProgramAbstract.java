package org.test;

 abstract class Sample {
	
	 public abstract void meth1();
	 public abstract void meth2();
}
public class ProgramAbstract extends Sample{

	@Override
	public void meth1() {
		System.out.println("method1");
	}

	@Override
	public void meth2() {
		System.out.println("method 2");
	}
	public static void main(String[] args) {
		ProgramAbstract p=new ProgramAbstract();
		p.meth1();
		p.meth2();
	}
}
