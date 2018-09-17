/*
 * Exercise 7, page 596.
 */
package javaprogramming.chapter11AdvancedInheritanceConcepts;

public class StoryTest {
    
    public static void main(String[] args) {
        Story[] stories = new Story[7];
        stories[0] = new ShortStory();
            stories[0].setTitle("The Pit and the Pendulum");
            stories[0].setAuthorName("E. A. Poe");
            stories[0].setPages(30);
        stories[1] = new ShortStory();
            stories[1].setTitle("The Gift of the Magi");
            stories[1].setAuthorName("O. Henry");
            stories[1].setPages(52);
        stories[2] = new Novella();
            stories[2].setTitle("The Old Man and the Sea");
            stories[2].setAuthorName("E. Hemingway");
            stories[2].setPages(97);
        stories[3] = new Novella();
            stories[3].setTitle("Of Mice and Men");
            stories[3].setAuthorName("J. Steinbeck");
            stories[3].setPages(107);
        stories[4] = new Novella();
            stories[4].setTitle("Goodbye, Columbus");
            stories[4].setAuthorName("P. Roth");
            stories[4].setPages(46);
        stories[5] = new Novel();
            stories[5].setTitle("Breakfast at Tiffany's");
            stories[5].setAuthorName("T. Capote");
            stories[5].setPages(120);
        stories[6] = new Novel();
            stories[6].setTitle("Animal Farm");
            stories[6].setAuthorName("G. Orwell");
            stories[6].setPages(98);
            
        for(Story temp : stories) {
            System.out.println("We are publishing the story " + temp.getTitle() + " by " + temp.getAuthorName() + ".\n   The story has " + temp.getPages() + " pages.");
            if(temp.getMessage() != null)
                System.out.println("   " + temp.getMessage());
            System.out.println();
        }
    }
}