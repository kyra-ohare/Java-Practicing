/*
 * Exercise 6, page 437
 */
package javaprogramming.chapter08Arrays;

public class SalespersonDemo {

	public static void main(String[] args) {
		int LIMIT = 10;
		Salesperson[] salesPeople = new Salesperson[LIMIT];
		Salesperson sp = new Salesperson(9999, 0);
		int i;
		
		for(i = 0; i < salesPeople.length; i++)
			System.out.println((i+1) + " Salespeople: " + sp.getID() + " Sales: " + sp.getSalesAmount());
		
		System.out.println();
		
		for(i = 0; i < salesPeople.length; i++) {
			int number = 110;
			double sales = 20000;
			while(i < salesPeople.length) {
				number++;
				sp.setID(number);
				sales += 5000;
				sp.setSalesAmount(sales);
				System.out.println((i+1) + " Salespeople: " + sp.getID()+ " Sales: " + sp.getSalesAmount());
				i++;
			}
		}
	}

}
