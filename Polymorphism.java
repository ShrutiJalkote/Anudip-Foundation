public class Polymorphism{
    public static void main(String[] args) {
        Stud s=new Stud();
        s.show("Shruti",20,101,"shrutij@gmail.com");
        Dog d = new Dog();
        d.cry();
    }
}
class Stud{
    void show(String name, int age, int id,String email)
    {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("ID: " + id);
        System.out.println("Email: " + email);
    }
    void show(String name, int age, int id)
    {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("ID: " + id);
    }
    void show(String name, int age)
    {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Animals{
    void cry(){
        System.out.println("Animals cry");
    }
}
class Dog extends Animals
{
    @Override
    void cry()
    {
        System.out.println("Dog barks");
    }
    

}

