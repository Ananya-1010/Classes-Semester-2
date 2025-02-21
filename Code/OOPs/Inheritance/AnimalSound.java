/* Create a base class Animal with a method makeSound(). Then, create two
subclasses Dog and Cat that override the makeSound() method to print "Bark" and
"Meow", respectively. Write a program that creates objects of both Dog and Cat and
calls the makeSound() method.
 */
public class AnimalSound {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();
        dog.makeSound();
        cat.makeSound();
    }
}

class Animal {
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}
class Dog extends Animal{
    @Override
    public void makeSound() {
        System.out.println("Dog barks");
        }
        }

class Cat extends Animal{
    @Override
    public void makeSound() {
        System.out.println("Cat meows");
        }
        }