/*
 * Exercise 4, page 595.
 */
package javaprogramming.chapter11AdvancedInheritanceConcepts;

public class InternationalDivision extends Division {
    String country;
    String language;
    
    public InternationalDivision(String country, String language) {
        this.country = country;
        this.language = language;
    }
    
    @Override
    public void display() {
        System.out.println("International Division\nCountry: " + country + " | Language: " + language + "\n");
    }
    
}