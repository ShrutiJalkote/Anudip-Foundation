public class StaticBlockClass{
    public static void main(String[] args) {
        System.out.println("Main method");
        First.Second obj= new First.Second();
        obj.msg();
        
    }
}

class Student{
    static {
        System.out.println("This is static block");
    }
}

class First{
    static class Second{
        void msg()
        {
            System.out.println("Hi");
        }
    }
}