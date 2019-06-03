package org.test;

class Overridding 
{
    public void display()
    {
        System.out.println(" base method");
    }
}
public class MethodOverridding extends Overridding
{
    public void display()
    {
        System.out.println("child method");
    }
    public static void main(String args[])
    {
    	MethodOverridding m=new MethodOverridding();
    	m.display();
    }
}
