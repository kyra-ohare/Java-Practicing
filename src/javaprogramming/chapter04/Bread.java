/*
 * Exercise 5, page 236.
 */
package javaprogramming.chapter04;

public class Bread{
	private String breadType;
	private int caloryPerSlice;
	final static String MOTTO = "The staff of life.";
	
	public Bread(String breadType, int caloryPerSlice){
		this.breadType = breadType;
		this.caloryPerSlice = caloryPerSlice;
	}
	
	public String getBreadType(){
		return breadType;
	}
	
	public void setBreadType(String breadType){
		this.breadType = breadType;
	}
	
	public int getCaloryPerSlice(){
		return caloryPerSlice;
	}
	
	public void setCaloryPerSlice(int caloryPerSlice){
		this.caloryPerSlice = caloryPerSlice;
	}
	
	public void printBread(){
		System.out.println(MOTTO);
		System.out.println("Type of bread: " + breadType);
		System.out.println("Calory per slice: " + caloryPerSlice);
	}
}