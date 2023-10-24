package com.repeat.coding;

abstract class Vehicle{
	private String name;
	abstract public String getName(String val);
	public String getName() {
		return "Vehicle name : "+name;
	}
	public void setName(String val) {
		name=val;
	}

}
class Car extends Vehicle{
	public Car(String val){
		setName(val);
	}
	public String getName(String val) {
		return "Car name:"+val;
	}
	public String getName(byte val[]) {
		return "Car name:"+val;
	}

}

public class test5{
public static void main(String[] args) {
	Vehicle obj = new Car("Spark");
	System.out.println(obj.getName());
	}
}