package com.example.coding;

public class test2 {
	public static void main(String[] args) {
		P p1=new C();
		P p2= new C(1);
		P p3=new C(1,2);
	
//		C p4=new C();
//		C p5= new C(1);
//		C p6=new C(1,2);
		
		
	}


}
class P {
	P(){
		System.out.println("A");
	}
	P(int a){
		System.out.println("B");
	}
}
class C extends P{
	C(){
		System.out.println("C");
	}
	C(int a){
//		super(a);
		System.out.println("D");
	}
	C(int a, int b){
//		super(a);
		System.out.println("E");
	}
}
