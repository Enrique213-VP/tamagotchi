package tamagotchi_dog;

public class Tamagotchi_Dog {

    public static void main(String[] args) {
       
       System.out.println("Start Game!");     
       Dog Scrappy = new Dog("Pandy","Blue", 3,4);
       System.out.println(Scrappy.getColour());
       System.out.println(Scrappy.getEnergy());
       System.out.println(Scrappy.getEatLevel());
       Scrappy.bark();
       for(int i =0; i<=2; i++){
       Scrappy.play();
    }
       Scrappy.setEnergy(4);
       Scrappy.comer(3);
       Scrappy.play();
    
}
    
}
