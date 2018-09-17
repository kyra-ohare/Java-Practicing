/*
 * Exercise 14, page 598.
 */
package javaprogramming.chapter11AdvancedInheritanceConcepts.com.course.buildings;

public class CreateBuildings {

    public static void main(String[] args) {
        Building[] building = new Building[4];
        
        building[0] = new House();
            building[0].setSquareFootage(200);
            building[0].setNumOfStories(3);
            ((House) building[0]).setNumOfBedrooms(5);
            ((House) building[0]).setNumOfBaths(2);
        
        building[1] = new School();
            building[1].setSquareFootage(300);
            building[1].setNumOfStories(4);
            ((School) building[1]).setNumOfClassrooms(50);
            ((School) building[1]).setGradeLevel("Elementary School");
        
        building[2] = new House();
            building[2].setSquareFootage(150);
            building[2].setNumOfStories(2);
            ((House) building[2]).setNumOfBedrooms(2);
            ((House) building[2]).setNumOfBaths(1);
        
        building[3] = new School();
            building[3].setSquareFootage(2000);
            building[3].setNumOfStories(5);
            ((School) building[3]).setNumOfClassrooms(100);
            ((School) building[3]).setGradeLevel("Grammar School");
            
            
            
        for(Building temp : building) {
            if(temp instanceof House)
                System.out.println("House:");
            else
                System.out.println("School:");
            
            System.out.println("Square Footage: " + temp.getSquareFootage() + " | Number of Stories: " + temp.getNumOfStories());
            if(temp instanceof House)
                System.out.println("Number of Bedrooms: " + ((House) temp).getNumOfBedrooms() + " | Number of Baths: " + ((House) temp).getNumOfBaths());
            else
                System.out.println("Number of Classrooms: " + ((School) temp).getNumOfClassrooms() + " | Grade Level: " + ((School) temp).getGradeLevel());
            System.out.println("");
        }
    }
}