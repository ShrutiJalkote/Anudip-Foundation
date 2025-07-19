public class multipleInheritance{
    public static void main(String[] args) {
        xyz obj=new xyz();
        obj.walk();
        
    }
}

interface Animal{
    public void walk();
}

interface Horse{

}

interface Dog{

}

class xyz implements Animal, Horse,Dog{
    public void walk(){
        System.out.println("Animal walks");
    }
}