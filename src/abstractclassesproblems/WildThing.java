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
public class WildThing extends Creature {
    private final String animal = "WildThing";

    
    public WildThing(int age, String name, String animal) {
        super(age, name, animal);
    }
    
    public WildThing(){
        
    };


    public String getAnimal() {
        return animal;
    }
    
    
    
    
    
    
}
