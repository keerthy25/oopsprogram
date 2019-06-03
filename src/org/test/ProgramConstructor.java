package org.test;

public class ProgramConstructor {
	
	public ProgramConstructor()
	{
		System.out.println("Default constructor");
	}
	public ProgramConstructor(int a)
	{
		System.out.println(a);
	}
	public static void main(String[] args) {
		ProgramConstructor pc=new ProgramConstructor();
		ProgramConstructor pc1=new ProgramConstructor(3);
				
	}
}
