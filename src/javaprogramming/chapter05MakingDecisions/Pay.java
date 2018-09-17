/*
 * Exercise 6, page 292.
 */
package javaprogramming.chapter05MakingDecisions;
import javax.swing.JOptionPane;
/*
 * This payroll has 3 levels, each which specific rates and possible additional plans.
 */
public class Pay {

	public static void main(String[] args) {
		byte skillLevel;
		double payRate = 0;
		double overtimeRate;
		byte hoursWorked;
		double salary = 0;
		int overtime;
		byte FULL_WEEK = 40;
		byte insuranceOption = 0;
		String insuranceExplanation = "Not eligible";
		double insuranceCost = 0;
		byte retirement = 2;
		double retirementRate = 0.03;
		String retirementOption = "For employees level 3 only";
		
		skillLevel = Byte.parseByte(JOptionPane.showInputDialog(null, "What is the employee's skill level?"));
		hoursWorked = Byte.parseByte(JOptionPane.showInputDialog(null, "How many hours has the employee worked?"));
		
		if(skillLevel == 1) {
			payRate = 17;
			
			if(hoursWorked < FULL_WEEK) {
				salary = hoursWorked * payRate;
			}else {
				overtimeRate = (payRate / 2) + payRate;
				overtime = hoursWorked - FULL_WEEK;
				salary = (FULL_WEEK * payRate) + overtime * overtimeRate;
			}
		} else
			if(skillLevel == 2) {				
				payRate = 20;
				
				if(hoursWorked < FULL_WEEK) {
					salary = hoursWorked * payRate;
				}else {
					overtimeRate = (payRate / 2) + payRate;
					overtime = hoursWorked - FULL_WEEK;
					salary = (FULL_WEEK * payRate) + overtime * overtimeRate;
				}
			} else
				if(skillLevel == 3) {
					//Level 3 has an additional plan.
					retirement = Byte.parseByte(JOptionPane.showInputDialog(null, "Would the employee like a retirement plan of 3% of the gross pay?"
							+ "\nOption 1: yes"
							+ "\nOption 2: no"));
					
					payRate = 22;
					
					if(hoursWorked < FULL_WEEK) {
						salary = hoursWorked * payRate;
					}else {
						overtimeRate = (payRate / 2) + payRate;
						overtime = hoursWorked - FULL_WEEK;
						salary = (FULL_WEEK * payRate) + overtime * overtimeRate;
					}
					if(retirement == 1) {
						retirementOption = "yes";
						retirementRate *= salary;
						salary += retirementRate;
					} else
						if(retirement == 2) {
							retirementOption = "no";
						}
				}
		//Levels 2 and 3 have access to insurance.
		if(skillLevel == 2 ||  skillLevel == 3) {
			insuranceOption = Byte.parseByte(JOptionPane.showInputDialog(null, "Which insurance would the employee like?\nOption 1: Medical Insurance --> 32.50 weekly"
					+ "\nOption 2: Dental Insurance --> 20.00 weekly"
					+ "\nOption 3: Long-term disability Insurance --> 10.00 weekly"
					+ "\nOption 4: No insurance."));
			if(insuranceOption == 1) {
				insuranceExplanation = "Medican Insurance ";
				insuranceCost = 32.50;
				salary -= insuranceCost;
			} else
				if(insuranceOption == 2) {
					insuranceExplanation = "Dental Insurance ";
					insuranceCost = 20.00;
					salary -= insuranceCost;
				} else
					if(insuranceOption == 3) {
						insuranceExplanation = "Long-term Disability Insurance ";
						insuranceCost = 10.00;
						salary -= insuranceCost;
					} else 
						if(insuranceOption == 4){
						insuranceExplanation = "No insurance chosen";
					}
		}
		//Final Report
		JOptionPane.showMessageDialog(null, "Skill level: " + skillLevel + "\n" +
				hoursWorked + " hours at pay rate of: " + payRate +
				"\nInsurance Option: " + insuranceExplanation +
				"\nInsurance Cost: " + insuranceCost +
				"\nRetirement Plan: 1(yes) or 2(no): " + retirementOption +
				"\nEmployee's net salary: " + salary);
	}

}
