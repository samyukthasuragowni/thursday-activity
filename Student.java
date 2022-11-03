package com.examples;

public class Student {
	String name;
	 String id;
	 double grade;
	 int age;
	 Student (String name, String id, int age )
	 {
		 this.name=name;
		 this.id=id;
		 this.age=age;
	 }
	 boolean isPassed(float grade)
	 {
		 return true;
	 }
}
class UnderGrad extends Student 
{
	UnderGrad(String name, String id, int age)
	{
		super(name,id,age);
	}
	
	boolean isPassed(float grade)
	{
		if(grade>=70.00)
		{
			return super.isPassed(grade);
					
		}
		else
		{
			return false;
		}
	}
}
class Grad extends Student
{
	Grad(String name,String id,int age)
	{
		super(name,id,age);
	}
	boolean isPassed(float grade)
	{
		if(grade>=80)
		{
			return super.isPassed(grade);
					
		}
		else
		{
			return false;
		}
	}
	
}
 public class StudentDetails {

	public static void main(String[] args) {
		Grad g=new Grad(sam","85",11);
      System.out.println("Grad is passed:"+g.isPassed(80));
        UnderGrad ug=new UnderGrad("sam","789",20);
          System.out.println("UnderGrad is passed:"+ug.isPassed(37));

	}


}
