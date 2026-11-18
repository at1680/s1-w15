import java.util.*;
// Represent a person's name with three components, a first name,
// a middle name, and a last name.

public class Friends {
    ArrayList<Name> friends = new ArrayList<>();
    Random r = new Random();
   // declare and initialize the ArrayList
   // declare and initialize the Random class
   
   // the constructor
   public Friends () {
       friends.add(new Name("Colin", "Chan"));
       friends.add(new Name("Adrian", "Baruzzi"));
       friends.add(new Name("Matias", "Wong"));
   }
   
   public void printRandomFriend(){
       //return a random Name object from the List
       System.out.println(friends.get(r.nextInt(friends.size())));
    }
   
  
}