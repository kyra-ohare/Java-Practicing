package javaprogramming.chapter09Arrays;

public class EmployeeDemo {

	public static void main(String[] args) {
		Employee[] someEmps = new Employee[5];
		
		someEmps[0].setFirstName("Clark");
		someEmps[0].setSalary(500);
		someEmps[1].setFirstName("Joan");
		someEmps[1].setSalary(600);
		someEmps[2].setFirstName("John");
		someEmps[2].setSalary(700);
	}
	
	public static void bubleSort(Employee[] array) {
		int a, b;
		Employee temp;
		int highSubscript = array.length - 1;
		for(a = 0; a < highSubscript; ++a)
			for(b = 0; b < highSubscript; ++b)
				if(array[b].getSalary() > array[b + 1].getSalary()) {
					temp = array[b];
					array[b] = array[b + 1];
					array[b + 1] = temp;
				}
	}

}
