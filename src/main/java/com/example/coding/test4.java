package com.example.coding;

class Foo {
	public int a=3;
	public void addValue(int i) {
		a=a+1;
		System.out.println("Foo: "+a+"");
	}
	public void addFive() {
		a+=5;
		System.out.println("Foo: "+a+"");
	}
}
class Bar extends Foo{
	public int a=8;
	public void addValue(double i) {
		a=a+(int)i;
		System.out.println("Bar: "+a+"");
	}
	public void addFive() {
		a+=5;
		System.out.println("Bar: "+a+"");
	}
}

public class test4{
public static void main(String[] args) {
	Foo f= new Bar();
	f.addValue(1);
	f.addFive();
}
}