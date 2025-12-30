package com.tnsif.keywords1;

	public class Rectangle extends Shape {
		int l;
	    int b;
		Rectangle (int l,int b) {
			this.l=l;
			this.b=b;
		}
		public int getL() {
			return l;
		}
		public void setL(int l) {
			this.l = l;
		}
		public int getB() {
			return b;
		}
		public void setB(int b) {
			this.b = b;
		}
		
		void show() {
			System.out.println("Rectangle");
		}
		void CalculateArea()
		{
			System.out.println("Area of Rectangle="+(l*b));
		}
	}



