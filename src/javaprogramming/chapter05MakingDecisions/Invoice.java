package javaprogramming.chapter05MakingDecisions;

public class Invoice {
	int number;
	double balanceDue;
	int month;
	int day;
	int year;
	
	public Invoice(int number, double balanceDue, int day, int month, int year) {
		if(number < 1000) {
			this.number = 0;
		} else
			this.number = number;

		this.balanceDue = balanceDue;

		if(month < 1 || month > 12) {
			System.out.println("Error: invalid month.\n");
			this.month = 0;
			//day = 0;
		} else
			this.month = month;

		if(month == 4 || month == 6 || month == 9 || month == 10 && day > 30) {
			System.out.println("Error: invalid day for month " + month + ".\n");
			this.day = 30;
		}
		if(day < 1 || day > 31) {
			System.out.println("Error: invalid day for month " + month + ".\n");
			this.day = 0;			
		}else {
			this.day = day;
		}
		if(month == 2 && day > 28) {
			System.out.println("Error: invalid day for February.\n");
			this.day = 28;
		}
		if(year < 2011 || year > 2020) {
			System.out.println("Error: invalid year." + ".\n");
			this.year = 0;
		} else
			this.year = year;
	}

	public void display() {
		System.out.println("Number: " + number + 
				"\nBalance Due: " + balanceDue + 
				"\nDay: " + day + 
				"\nMonth: " + month +
				"\nYear: " + year);
		System.out.println();
	}
}
