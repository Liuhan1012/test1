package com.work.www;

public class Student
{
  private static String name;
  private static int age;
  private static int id;
	Student(String name) 
	{
//		������1
		this.name=name;
        
	}
	Student(int age,int id)
	{
		this.age=age;
		this.id=id;
	}
	Student()
	{
    System.out.println("����"+name+"����"+age+"ѧ��"+id);
	}
    public static void main(String[] args)
	{
		Student s1=new Student("����");
		Student s2=new Student(21,5);
        Student p=new Student();
//        System.out.println(s1.age);
	}
}        
