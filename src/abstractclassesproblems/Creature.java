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
public abstract class Creature implements Animal {
    private String run;
    private final String eat = "chomp chomp";
    int age;
    private String animal;
    private String name;

    public Creature(){
        
    };
    public Creature(int age, String name, String animal) {
        this.age = age;
    }    
    public void animalType(String animal){
        this.animal = animal;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    
    public String getEat() {
        return eat;
    }

    @Override
    public String eat(){
        return eat;
    };
    
    
    
    @Override
    public String run(String animal){
        switch (animal) {
            case "Dog":
                run = "running";
                break;
            case "Cat":
                run = "pitter patter";
                break;
            case "WildThing":
                run = "AHHHHHHH";
                break;
        }
        return run;
    }
}
