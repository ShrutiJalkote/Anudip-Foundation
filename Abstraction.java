public class Abstraction{
    public static void main(String[] args) 
    {
        Dog d=new Dog();
        d.sleep();
        d.makeSound();
        
    }
}
abstract class Animal
{
    abstract void makeSound();
    public void sleep()
    {
        System.out.println("Animal eats");
    }
}

class Dog extends Animal
{
    @Override
    void makeSound()
    {
        System.out.println("Dog Barks");
    }
}

