public class oops{
        
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Shruti";
        s1.age = 20;
        s1.printInfo();
        Student s2 = new Student("Ishwari");
        s2.printInfo();
        Student s3= new Student("Hrucha", 22);
        s3.printInfo();
        Student s4=new Student(s2);
        s4.printInfo();
    }
}

class Student
{
    String name;
    int age;

    void printInfo()
        {
            System.out.println("Name:"+this.name);
            System.out.println("Age:"+this.age);
        }
    Student(){
        System.out.println("Constructor called");
    }
    Student(String name, int age)
    {
        this.name = name;
        this.age = age;
        System.out.println("Parameterized Constructor called");
    }
    Student(String name)
    {
        this.name = name;
        System.out.println("Parameterized Constructor called");
    }
    Student(int age)
    {
        this.age= age;
        System.out.println("Parameterized Constructor called");
    }
    Student(Student s)
    {
        this.name = s.name;
        this.age = s.age;
        System.out.println("Copy Constructor called");
    } 
}