package javaprogramming.chapter06Looping;

public class Purchase{
	private int invoiceNumber;
	private double amountOfSale;
	private double amountOfSalesTax;
	
	public Purchase() {
		invoiceNumber = 10000;
		amountOfSale = 0;
		amountOfSalesTax = 0;
	}
	
	public void setInvoiceNumber(int invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}
	
	public void setAmountOfSale(double amountOfSale) {
		this.amountOfSale = amountOfSale;
	}
	
	public void setAmountOfSalesTax(double amountOfSales) {
		this.amountOfSalesTax = amountOfSales * 0.05;
	}
	
	public void display() {
		System.out.println("Invoice Number: " + invoiceNumber +
				"\nAmount of Sale: " + amountOfSale +
				"\nAmount of Sales Tax (5%): " + amountOfSalesTax);
	}
}