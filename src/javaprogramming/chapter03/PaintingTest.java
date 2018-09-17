/*
 * Exercise 14, page 173.
 */
package javaprogramming.chapter03;

import javax.swing.JOptionPane;

public class PaintingTest{
	public static void main(String[] args){
		Painting p1 = new Painting();
		Painting p2 = new Painting();
		Painting p3 = new Painting();
		
		p1 = getData(p1);
		p2 = getData(p2);
		
		p1.printAll();
		p2.printAll();
		p3.printAll();
	}
	public static Painting getData(Painting p){
		String Title;
		String Artist;
		String Medium;
		String PriceS;
		double Price;
		
		Title = JOptionPane.showInputDialog(null, "Title:");
		Artist = JOptionPane.showInputDialog(null, "Artist:");
		Medium = JOptionPane.showInputDialog(null, "Medium:");
		PriceS = JOptionPane.showInputDialog(null, "Price:");
		Price = Double.parseDouble(PriceS);
			
		p.setTitle(Title);
		p.setArtist(Artist);
		p.setMedium(Medium);
		p.setPrice(Price);
		
		return p;
	}
}