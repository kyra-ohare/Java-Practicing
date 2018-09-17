package javaprogramming.chapter06Looping;

public class Population {
	public static void main(String[] args) {
		int mexPopulation = 114;
		double mexPercentage = 0.0101;
		int usaPopulation = 312;
		double usaPercentage = 0.0015;
		int year = 2;
		double mexResult;
		double usaResult;
		
		System.out.printf("Year:   1 - USA Population: %d million\t\t Mexico Population: %d million\n", usaPopulation, mexPopulation);
		while(usaPopulation >= 0 || mexPopulation <= 0) {
			usaResult = usaPopulation - (usaPopulation * usaPercentage);
			mexResult = (mexPopulation * mexPercentage) + mexPopulation;
			
			if(mexPopulation < usaPopulation)
			System.out.printf("Year: %3d - USA Population: %f million\t Mexico Population: %f million\n", year, usaResult, mexResult);
			
			year++;
			usaPopulation --;
			mexPopulation ++;
		}		
	}
}
