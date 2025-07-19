public class finalPgm{
    public static void main(String[] args){
        Child c=new Child();
        c.display();
        // final int speed=200;
    }

}

class Parent{
    final void display()
    {
        System.out.println("Hii");
 
    }
}

class Child extends Parent{

}

