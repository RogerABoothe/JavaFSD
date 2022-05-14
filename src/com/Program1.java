package com;
import java.util.Scanner;
public class Program1 {

	public static void main(String[] args) {
		String name;
		String title;
		int id ;
		int age;
		int salary;

		Scanner scr = new Scanner(System.in);
		
		System.out.println("Hello and welcome!");
		System.out.println("Before we get started I want to know more about you");
		
		System.out.print("What is your full name?");
		name = scr.nextLine();
		
		System.out.print("What is your Job Title?");
		title = scr.nextLine();
		
		System.out.print("What is your ID Number?");
		id = scr.nextInt();
		
		System.out.print("What is your age?");
		age = scr.nextInt();
		
		System.out.print("What is your salary?");
		salary= scr.nextInt();

		System.out.println("Your full name is: " + name);
		System.out.println("Your Job Title is: " + title);
		System.out.println("Your User ID is: " + id);
		System.out.println("You are:" + age + " years old");
		System.out.println("You make: " + salary);
	}

}
