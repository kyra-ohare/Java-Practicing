/*
 * Exercise 7, page 596.
 */
package javaprogramming.chapter11AdvancedInheritanceConcepts;

public class ShortStory extends Story {

    @Override
    public void setPages(int pages) {
        if(pages < Story.fifty)
            this.pages = pages;
        else {
            this.pages = pages;
            difference = pages - Story.fifty + 1; //+ 1 because it's the num of pages - 49
            message = difference + " pages must be cut to qualify as a short story.";
            setMessage(message);
        }
    }
}