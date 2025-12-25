package com.tnsif.accessmodifiers.differentpackage;
import com.tnsif.accessmodifiers.samepackage.AccessModifiers;
public class DifferentClass {
	public void display() {
		System.out.println("Different Class in Different Package");
		AccessModifiers obj=new AccessModifiers();
		System.out.println("d="+obj.d);
	}

}
