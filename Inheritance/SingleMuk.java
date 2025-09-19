package Inheritance;
abstract class Animal {
public abstract void animalSound();
    
public void sleep(){
    System.out.println("Now Sleeping Time");
}
}

class Cat extends Animal{
    public void animalSound(){
        System.out.println("The Tiger says raw raw");
    }
}
public class SingleMuk {
    public static void main(String[] args) {
        Cat c = new Cat();
        c.animalSound();
        c.sleep();
    }
    
}
