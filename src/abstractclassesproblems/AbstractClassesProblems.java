/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractclassesproblems;

/**
 *
 * @author Alyson
 */
public class AbstractClassesProblems {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        WildThing wildThing = new WildThing();
        String animal = wildThing.getAnimal();
        Creature paul = new WildThing(23, "Paul", animal);
        
        System.out.println(paul.run(animal));
        
        
        
        

        
    }

    
    
}
