package com.examples;

public class Rectangle {
			int length=15;
			int breadth=16;
			
			void PrintTheArea()
			{
				
				System.out.println("Area of Rec is:"+length*breadth);
				
			}
			void PrintTheperimeter()
			{
				
				System.out.println("Perimeter of Rec is:"+2*(length+breadth));
				
			}
		}
		class Square extends Rectangle
		{
			int side=4;
			int side1=2;
			int side2=2;
			Square()
			{
			super();
			}
			void dislay()
			{
			System.out.println("Area of the Square is:"+side1*side2);
			System.out.println("Perimeter of the Square is:"+4*side);
		}
		}
		class RectangleAndSquare {  
			public static void main(String[] args) {
				Rectangle r=new Rectangle();
				r.PrintTheArea();
				r.PrintTheperimeter();
				Square s=new Square();
				s.dislay();
			}}
