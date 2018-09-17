/*
 * Exercise 7, page 596.
 */
package javaprogramming.chapter11AdvancedInheritanceConcepts;

public class Novella extends Story {
    
    @Override
    public void setPages(int pages) {
        if(pages >= Story.fifty && pages <= Story.oneHundred)
            this.pages = pages;
        else {
            this.pages = pages;
            if(pages < Story.fifty) {
                difference = Story.fifty - pages;
                message = difference + " pages must be added to qualify as a novella.";
                setMessage(message);
            } else if(pages > Story.oneHundred) {
                difference = pages - Story.oneHundred;
                message = difference + " pages must be cut to qualify as a novella.";
                setMessage(message);
            }
        }
    }
}