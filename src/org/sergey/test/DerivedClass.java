package org.sergey.test;

public class DerivedClass extends BaseClass{
	public String fieldOfDerivedClass;
	public void accessBaseClassField(){
		System.out.println(fieldOfBaseClass);
		System.out.println(super.fieldOfBaseClass);
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DerivedClass derivedClass = new DerivedClass();
		derivedClass.accessBaseClassField();

	}

}
