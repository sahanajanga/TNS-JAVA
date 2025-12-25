package com.tnsif.accessmodifiers;

import com.tnsif.accessmodifiers.differentpackage.DifferentClass;
import com.tnsif.accessmodifiers.differentpackage.SameClass;
import com.tnsif.accessmodifiers.samepackage.NonSubClass;
import com.tnsif.accessmodifiers.samepackage.SubClass;

public class AccessModifiersDemo {

	public static void main(String[] args) {
		SubClass sc=new SubClass();
		sc.display();
		NonSubClass nsc=new NonSubClass();
	    nsc.display();
	    SameClass s=new SameClass(); 
	    s.display();
	    DifferentClass dc=new DifferentClass();
	    dc.display();
	    
		

	}

}
