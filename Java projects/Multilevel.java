class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}
class Mammal extends Animal {
    void walk() {
        System.out.println("Mammals can walk.");
    }
}
class Dog extends Mammal {
    void bark() {
        System.out.println("Dog barks.");
    }
}
public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog();

        myDog.eat();    
        myDog.walk();   
        myDog.bark(); 
    }
}
