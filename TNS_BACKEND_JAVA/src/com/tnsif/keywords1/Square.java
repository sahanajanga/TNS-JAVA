package com.tnsif.keywords1;

public  class Square extends Shape {
	private int side;
	Square (int side){
		this.side=side;
	}
	public int getSide() {
		return side;
	}
	public void setSide(int side) {
		this.side = side;
	}
	void show() {
		System.out.println("Square");
	}
	void CalculateArea() {
		System.out.println("Area of Square=" +(side*side));
	}

	}
	



