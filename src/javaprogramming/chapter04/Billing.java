/*
 * Exercise 2, page 235.
 */
package javaprogramming.chapter04;

public class Billing{
	public static void main(String[] args){
		computeBill(10);
		computeBill(10, 2);
		computeBill(10, 2, 5);
	}
	
	static double photobook;
	static int amount;
	
	public static double computeBill(double price){
		photobook = 0.08 + price;
		System.out.println("Photobook plus tax of 8% = " + photobook);
		return photobook;
	}
	
	public static double computeBill(double price, int quantity){
		double amount = price * quantity;
		double total = 0.08 * amount;
		photobook = amount + total;
		System.out.println("Amount: " + amount + "\nTotal: " + total + "\nPhotobook: " + photobook);
		//System.out.println(quantity + " photobook(s) plus tax of " + tax + "% = " + photobook);
		return photobook;
	}
	
	public static double computeBill(double price, int quantity, double coupon){
		double amount = price * quantity;
		amount -= coupon;
		double total = amount * 0.08;
		photobook = amount - total;
		System.out.println("Photobook less " + coupon + " coupon is " + photobook);
		return photobook;
	}
}