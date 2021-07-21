/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tamagotchi_dog;

/**
 *
 * @author sevar
 */
public class Dog {
    
    private String race;
    private String Colour;
    private int energy;
    private int EatLevel;

    public Dog(String race, String Colour, int energy, int EatLevel) {
        this.race = race;
        this.Colour = Colour;
        this.energy = energy;
        this.EatLevel = EatLevel;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getColour() {
        return Colour;
    }

    public void setColour(String Colour) {
        this.Colour = Colour;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public int getEatLevel() {
        return EatLevel;
    }

    public void setEatLevel(int EatLevel) {
        this.EatLevel = EatLevel;
    }
    
    public void comer(int eat){
        this.EatLevel = this.EatLevel+eat;
        System.out.println("The dog already ate");
    }
    
    public void sleep(int hours){
        this.energy += hours;
        System.out.println("The dog takes a nap");
    }
    
    public void play(){
        if (this.energy <= 0 || this.EatLevel <= 2){
            System.out.println("The dog is tired");
        }else{
            this.energy -= 1;
            this.energy -= 2;
            System.out.println("The dog is happy while to play");
        }
    }
    
    public void bark(){
        System.out.println("Guau! Guau! Guau!");
    }

}
