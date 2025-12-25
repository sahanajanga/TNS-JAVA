package com.tnsif.accessmodifiers.differentpackage;
import com.tnsif.accessmodifiers.samepackage.AccessModifiers;
public class SameClass extends AccessModifiers{
	public void display() {
		System.out.println("SameClass in Different Package");
		System.out.println("c="+c);
		System.out.println("d="+d);
	}
	

}
