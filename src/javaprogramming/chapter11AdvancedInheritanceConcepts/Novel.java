/*
 * Exercise 7, page 596.
 */
package javaprogramming.chapter11AdvancedInheritanceConcepts;

public class Novel extends Story {
    
    @Override
    public void setPages(int pages) {
        if(pages > Story.oneHundred)
            this.pages = pages;
        else {
            this.pages = pages;
            difference = Story.oneHundred - pages + 1; //+ 1 because it's the num of pages greater than or equals 101
            message = difference + " pages must be added to qualify as a novel.";
            setMessage(message);
        }
    }
}