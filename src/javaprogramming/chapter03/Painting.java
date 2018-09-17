/*
 * Exercise 14, page 174.
 */
package javaprogramming.chapter03;

import javax.swing.JOptionPane;

public class Painting{
	private String title;
	private String artist;
	private String medium;
	private double price;
	private final double commission;
	
	public Painting(){
		title = "Some title";
	  	artist = "Some artist";
		medium = "Some medium";
		price = 0;
		commission = 0.20;
	}
	
	public String getTitle(){
		return title;
	}
	public void setTitle(String title){
		this.title = title;
	}
	public String getArtist(){
		return artist;
	}
	public void setArtist(String artist){
		this.artist = artist;
	}
	public String getMedium(){
		return medium;
	}
	public void setMedium(String medium){
		this.medium = medium;
	}
	public double getPrice(){
		return price;
	}
	public void setPrice(double price){
		this.price = price;
	}
	public double commissionDeduction(){
		double netPrice = price * commission;
		return netPrice;
	}
	public double netPrice() {
		double total = getPrice() - commissionDeduction();
		return total;
	}
	public void printAll(){
		JOptionPane.showMessageDialog(null, "Title: " + title + "\nArtist: " + artist + "\nMedium: " + medium + "\nPrice: " + price + "\n20% COMMISSION" + "\nCommision: " + commissionDeduction() + "\nNet Price: " + netPrice());
	}
}