/*
 * Exercise 4, page 595.
 */
package javaprogramming.chapter11AdvancedInheritanceConcepts;

public class DivisionTest {
    
    public static void main(String[] args) {
        Division[] divs = new Division[4];
        
        divs[0] = new InternationalDivision("Brazil", "Portuguese");
        divs[1] = new DomesticDivision("Leinster");
        divs[2] = new InternationalDivision("Spain", "Spanish");
        divs[3] = new DomesticDivision("Ulter");
        
        for(Division temp : divs) {
            temp.display();
        }
    }
}