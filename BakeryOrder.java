/*
* File name: BakeryOrder.java
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

/**
* Keeps track of the information for 1 bakery order
*
* @author Jacob Cichon
*
*/
public class BakeryOrder
{

	//Variables
	
	
	final double cookie = 0.75;
	final double donut = 0.55;
	final double cake = 8.50;
	final double pie = 6.50;
	final double taxRate = 0.07;
	final int deliveryFee = 3; 
	int numOfCookie;
	int numOfDonut;
	int numOfCake;
	int numOfPie;
	String receipt;


	//Getters and Setters

	public int getNumOfCookie()
	{
		return numOfCookie;
	}




	public void setNumOfCookie(int numOfCookie)
	{
		this.numOfCookie = numOfCookie;
	}




	public int getNumOfDonut()
	{
		return numOfDonut;
	}




	public void setNumOfDonut(int numOfDonut)
	{
		this.numOfDonut = numOfDonut;
	}




	public int getNumOfCake()
	{
		return numOfCake;
	}




	public void setNumOfCake(int numOfCake)
	{
		this.numOfCake = numOfCake;
	}




	public int getNumOfPie()
	{
		return numOfPie;
	}




	public void setNumOfPie(int numOfPie)
	{
		this.numOfPie = numOfPie;
	}




	public double getCookie()
	{
		return cookie;
	}




	public double getDonut()
	{
		return donut;
	}




	public double getCake()
	{
		return cake;
	}




	public double getPie()
	{
		return pie;
	}




	public double getTaxRate()
	{
		return taxRate;
	}




	public int getDeliveryFee()
	{
		return deliveryFee;
	}
		
	//Calculate Subtotal Method
	
	public double calculateSubtotal() {
	
	double subTotal= ((cookie * numOfCookie) + (donut * numOfDonut) + (pie * numOfPie) + (cake * numOfCake));
	
	return subTotal;
	}
	
	//Calculate Tax Method
	
	public double calculateTax() {
	
	double tax;
	tax=calculateSubtotal()*taxRate;
	
	return tax;
	}
	
	//Display Receipt Method
	
	public String displayReceipt() {
	
	String string = " ";
	double receiptTotal;
	receiptTotal=calculateSubtotal()+calculateTax()+getDeliveryFee();
	receiptTotal=Math.round(receiptTotal*100.0)/100.0;
	
	System.out.println(" ");
	System.out.println("Sub-total: \t" + "$" + calculateSubtotal());
	System.out.println("Tax: \t\t" + "$" + calculateTax());
	System.out.println("Delivery: \t" + "$" + getDeliveryFee());
	System.out.println("Total Bill: \t" + "$" + receiptTotal);
	
	return string;
	}
	
	
	
	
	
	

	}