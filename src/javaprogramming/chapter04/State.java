package javaprogramming.chapter04;

public class State {
	String stateName;
	double population;
	City city;
	
	public State(String stateName, double population, String capital, double populousCity) {
		this.stateName = stateName;
		this.population = population;
		city = new City(capital, populousCity);
	}
	
	public String getStateName() {
		return stateName;
	}

	public double getPopulation() {
		return population;
	}

	public void displayState() {
		System.out.println("State Name: " + getStateName() + 
				"\nPopulation: " + getPopulation());
		System.out.println("Capital Name: " + city.getCapital() + 
				"\nMost populous city: " + city.getPopulousCity());
		System.out.println();
	}
	
	private class City{
		private String capital;
		private double populousCity;
		
		public City(String capital, double populousCity) {
			this.capital = capital;
			this.populousCity = populousCity;
		}

		public String getCapital() {
			return capital;
		}

		public double getPopulousCity() {
			return populousCity;
		}
	}
}
