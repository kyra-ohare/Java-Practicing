/*
 * Exercise 7, page 596.
 */
package javaprogramming.chapter11AdvancedInheritanceConcepts;

public abstract class Story {
    String title;
    String authorName;
    int pages;
    String message;
    int difference;
    public static final int fifty = 50;
    public static final int oneHundred = 100;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getPages() {
        return pages;
    }

    public abstract void setPages(int pages);

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}