package com.dev.app;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class List {

	static Scanner sc = new Scanner(System.in);

	static HashSet<Contact> set = new HashSet<>();
	static HashMap<Integer,Contact> hm = new HashMap<>();

	public static void main(String[] args) {

		// adding few contacts for search operation	

		Contact c =  new Contact();
		c.setName("Kaveri");
		c.setNumber(87687654);
		c.setGroup("friends");
		c.setId(1);

		set.add(c);
		hm.put(1,c);

		Contact c1 =  new Contact();
		c1.setName("Anchal");
		c1.setNumber(87614321);
		c1.setGroup("friends");
		c1.setId(2);

		set.add(c1);
		hm.put(2,c1);

		Contact c2 =  new Contact();
		c2.setName("Pornima");
		c2.setNumber(98761234);
		c2.setGroup("friends");
		c2.setId(3);

		set.add(c2);
		hm.put(3,c2);
		//	System.out.println(set);

		display();

	}

	public static void display() {
		System.out.println("Press 1 Show all contacts");
		System.out.println("Press 2 Search for contacts");
		System.out.println("Press 3 Operate on contacts");
		int enteredno = sc.nextInt();

		if(enteredno==1) {
			showAll();
		}
		else if(enteredno==2) 
		{
			Methods.search();
		}else if(enteredno==3)
		{
			Methods.showOp();
		}
		System.out.println();	
		display();
	}

	public static void showAll() {
		System.out.println(set);
	}



}
