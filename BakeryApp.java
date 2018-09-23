/*
* File name: BakeryApp.java
*
* Programmer: Jacob Cichon
* ULID: JVCICHO
*
* Date: Sep 18, 2018
*
* Class: IT 168
* Lecture Section: 19
* Lecture Instructor: Dr. Karen Johnson
* Lab Section: 21
* Lab Instructor: Kumar Rakholia
*/
package edu.ilstu;

import java.util.Scanner;


/**
* Displays menu of bakery items and their prices, calculates tax and delivery fee, displays receipt with total
*
* @author Jacob Cichon
*
*/
public class BakeryApp
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		
	/**
	 * 
	 */
	
	BakeryOrder avfac = new BakeryOrder();
	//Displays Bakery Menu
		
	System.out.println("Bakery Shop Menu");
	System.out.println("_________________");
	System.out.println("Cookie: $" + avfac.cookie);
	System.out.println("Donut: $" + avfac.donut);
	System.out.println("Cake: $" + avfac.cake);
	System.out.println("Pie: $" + avfac.pie);
	
	
	Scanner keyboard = new Scanner(System.in);
    
    int numOfCookie = 0;
    int numOfDonut = 0;
    int numOfCake = 0;
    int numOfPie = 0;
    
    //Asks user what they want to order
    
    System.out.print("\n"+"How many cookies would you like?: ");        
    numOfCookie = keyboard.nextInt();
    System.out.print("How many donuts would you like?: ");        
    numOfDonut = keyboard.nextInt();
    System.out.print("How many cakes would you like?: ");        
    numOfCake = keyboard.nextInt();
    System.out.print("How many pies would you like?: ");        
    numOfPie = keyboard.nextInt();
		
    keyboard.close();
    
    //Displays Bakery Order Summary
    
    System.out.println("\n" + "Bakery Shop Order Summary");
	System.out.println("_________________________");	
	System.out.println("Item:   " + "\t" + "\t" + "Quanity:");
	System.out.println("Cookies " + "\t" + "\t" + numOfCookie);
	System.out.println("Donuts  " + "\t" + "\t" + numOfDonut);
	System.out.println("Cakes   " + "\t" + "\t" + numOfCake);
	System.out.println("Pies    " + "\t" + "\t" + numOfPie);
	
	
	/**
	 * 
	 */
	
	BakeryOrder receipt = new BakeryOrder();
	receipt.displayReceipt();
	
	
		
		
		
		
		
		
		
		
		
	}

}
