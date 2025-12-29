package com.tnsif.keywords;

public class Keywordsuper {
	int a=10;
	Keywordsuper(int a){
		System.out.println("this is a constructor");
		}
public void show() {
	System.out.println("this is demo method");
	}
}
class Demo extends Keywordsuper {
	int a=20;
	Demo() {
		super(30);
		System.out.println("super is a constructor");
	}
	void display() {
		
		System.out.println("Demo a="+a);
		System.out.println("Keyword a="+super.a);
super.show();
	}
}

