package com.dev.app;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Methods {

	static Scanner sc = new Scanner(System.in);
	static HashSet<Contact> set = new HashSet<>();
	static HashMap<Integer,Contact> hm = new HashMap<>();


	

	public static void search() {
		System.out.println("Enter the Name to Search");
		String name = sc.next();
		Contact c = hm.get(name);
		if(c!=null) {
			if(c.getName().equals(name)) {
				System.out.println("Press 1 to Call");
				System.out.println("Press 2 to message");
				System.out.println("Press 3 to go back to main menu");
				int n =  sc.nextInt();
				calling(n);
			}

		} 
		System.out.println("this contact doesnt exists");


	}



	private static void calling(int n) {
		Contact c = new Contact();
		String ca = c.getName();
		if(n==1) {
			System.out.println("calling"+ca+".....");
			System.out.println("call ended.....");
		}
		else if(n==2) {
			System.out.println("type the message");
			String msg = sc.next();
			System.out.println("message is sending....");
			System.out.println("message sent");
		}
		else if(n==3) {
			List.display();
		}
	}


	public static void showOp() {
		System.out.println("Press 1 to add contact");
		System.out.println("Press 2 to delete contact");
		System.out.println("Press 3 to edit contact");
		int n = sc.nextInt();
		operation(n);
		System.out.println();
		List.display();
	}


	private static void operation(int n) {
		if (n==1) {
			addContact();
		}else if(n==2) {
			deleteContact();
		}else if(n==3) {
			editContact();
		}

	}


	private static void editContact() {
		System.out.println("type the contact name to change");
		String name = sc.next();
		System.out.println("change the group");
		String grp = sc.next();
		Contact c = new Contact();
		c.setName(name);
		c.setGroup(grp);	
		set.add(c);
	}


	private static void deleteContact() {
		System.out.println("type the contact name to delete");
		String name = sc.next();
		Contact c = new Contact();
		if(c!=null) {
			if(c.getName().equals(name)) {
		set.remove(c);
			}
		}
	}
	
	static void addContact() {
		System.out.println("type the contact name");
		String name = sc.next();
		System.out.println("add the group");
		String grp = sc.next();
		Contact c = new Contact();
		c.setName(name);
		c.setGroup(grp);	
		set.add(c);
	}

}
