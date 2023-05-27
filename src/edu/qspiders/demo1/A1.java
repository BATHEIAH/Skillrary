package edu.qspiders.demo1;

public class A1 
{
static int a=13;
void m1()
{
	System.out.println("in the non static default method");
}
public static void main(String[] args)
{
A1 a1=new A1();
a1.m1();
System.out.println(a);

}
}

