/*
 *Exercie 9, page 494.
*/
package javaprogramming.chapter09Arrays;

import java.util.Scanner;

public class Majors {
    enum Major {ACC, CHEM, CIS, ENG, HIS, PHYS};
    
    public static void main(String[] args) {
        Major mjr = null;
        String answer;
        Scanner input = new Scanner(System.in);
        
        for(Major m : Major.values())
            System.out.print(m + " ");
        System.out.println();
        do {
            System.out.print("Enter a major >>>> ");
            answer = input.nextLine().toUpperCase();
            try {
                mjr = Major.valueOf(answer);
                
                switch(mjr) {
                    case ACC:
                    case CIS:
                        System.out.println("Business Division");
                        break;
                    case CHEM:
                    case PHYS:
                        System.out.println("Science Division");
                        break;
                    case ENG:
                    case HIS:
                        System.out.println("Humanities Division");
                        break;
                }
            } catch(IllegalArgumentException e) {
                System.err.println("Sorry, try again!");
            }
            System.out.print("\nDo you wish to continue (Y/N)? ");
            answer = input.nextLine();
        } while(answer.charAt(0) == 'y' || answer.charAt(0) == 'Y');
        System.out.println("Bye");
    }
}
