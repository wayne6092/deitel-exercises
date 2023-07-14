/*
 * Debugging Exercise - Chapter 10
 *
 * Debug the error(s) and submit to the Dropbox 
 * Please do not submit if it is not debugged
 *  
 * NOTE:  This file does NOT require debugging.
 */

import java.util.ArrayList;

public class PetTest {

    public static void main(String[] args)
    {
        ArrayList<Pet> myPets = new ArrayList<Pet>();
        
        myPets.add(new Parrot("Boss"));
        myPets.add(new Cat("Oreo"));
        myPets.add(new Dog("Riley"));
        
        for (Pet p: myPets)
        {
            p.saySomething();
            System.out.println(p);
        }
    }
}
