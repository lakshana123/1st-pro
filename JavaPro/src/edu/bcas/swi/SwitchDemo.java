package edu.bcas.swi;

import java.util.Scanner;

public class SwitchDemo {
	
	//#days in a month
	
	public static void main(String[] args) {
		  
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Month: ");
		int month = scan.nextInt();
		
		switch (month) {
		case 1:
		System.out.println("This is January has 31 days");
			break;
		case 2:
			System.out.println("This is February has 28days");
			break;
		case 3:
			System.out.println("This is March has 31 days");
			break;
		case 4:
			System.out.println("This is April has 30 days");
			break;
		case 5:
			System.out.println("This is May has 31 days");
			break;
		case 6:
			System.out.println("This is June has 30 days");
			break;
		case 7:
			System.out.println("This is July has 31 days");
			break;
		case 8:
			System.out.println("This is August has 31 days");
			break;
		case 9:
			System.out.println("This is Sebtember has 30 days");
			break;
		case 10:
			System.out.println("This is October has 31 days");
			break;
		case 11:
			System.out.println("This is November has 30 days");
			break;
		case 12:
			System.out.println("This is December has 31 days");
			break;
		default:
			System.out.println("Invalid month!!!");
			break;
		}
		}
		
	
		
		
	}


