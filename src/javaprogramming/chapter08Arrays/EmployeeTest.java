package javaprogramming.chapter08Arrays;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee[] emps = new Employee[10];
		
		final int START_NUM = 101;
		final double PAYRATE = 6.35;
		
		for(int i = 0; i < emps.length; ++i) {
			emps[i] = new Employee(START_NUM + i, PAYRATE);
			System.out.println("Employee: " + emps[i].getEmpNum() + "; Payrate: " + emps[i].getEmpSal());
		}
		
		//enhanced for Loop
		for(Employee worker : emps)
			System.out.println("Enhanced for loop: " + worker.getEmpNum() + " " + worker.getEmpSal());
	}

}
