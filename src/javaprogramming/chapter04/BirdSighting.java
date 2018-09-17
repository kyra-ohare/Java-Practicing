/*
 * Exercise 3, page 235.
 */
package javaprogramming.chapter04;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class BirdSighting {
	String species;
	int howMany;
	GregorianCalendar day = new GregorianCalendar();
	int whichDay = day.get(GregorianCalendar.DAY_OF_YEAR);
	
	public BirdSighting() {
		species = "robin";
		howMany = 1;
		whichDay = 1;
	}
	
	public BirdSighting(String species, int howMany, int whichDay) {
		this.species = species;
		this.howMany = howMany;
		this.whichDay = whichDay;
	}

	public String getSpecies() {
		return species;
	}

	public int getHowMany() {
		return howMany;
	}

	public Calendar getToday() {
		return day;
	}

	public int getWhichDay() {
		return whichDay;
	}
	
	public void display() {
		System.out.println("Species: " + species + 
				"\nNumber seen: " + howMany +
				"\nWhich day: " + whichDay);
		System.out.println();
	}
	
}
