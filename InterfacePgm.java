public class InterfacePgm{
    public static void main(String[] args) {
        Horse h=new Horse();
        h.walk();
        
    }
}

interface Animal{
    public void walk();
}

class Horse implements Animal{
    public void walk() {
        System.out.println("Horse running");
    }
   
}