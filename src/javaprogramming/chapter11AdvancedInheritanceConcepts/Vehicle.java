package javaprogramming.chapter11AdvancedInheritanceConcepts;

public abstract class Vehicle {
	private String powerSource;
	private int wheels;
	protected int price;
	
	public Vehicle(String powerSource, int wheels) {
		setPowerSource(powerSource);
		setWheels(wheels);
		setPrice();
	}
	
	public String getPowerSource() {
		return powerSource;
	}
	
	public void setPowerSource(String source) {
		powerSource = source;
	}
	
	public int getWheels() {
		return wheels;
	}
	
	public void setWheels(int wls) {
		wheels = wls;
	}
	
	public int getPrice() {
		return price;
	}
	
	public abstract void setPrice();
}
