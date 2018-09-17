package javaprogramming;

public class TestMain {
    public static void main(String[] args) {
        StringBuilder test = new StringBuilder("test");
        
        System.out.println(test);
        
        System.out.println("capacity: " + test.capacity());
        System.out.println("length: " + test.length());
    }
}