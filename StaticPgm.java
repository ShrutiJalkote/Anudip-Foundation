public class StaticPgm{
    public static void main(String[] args) {
        //Student s=new Student();
        //System.out.println(s.collegeName);
        //Student.collegeName="MIT";
        //Student s1=new Student();
        //System.out.println(s1.collegeName);
        //Student s3=new Student();
        //System.out.println(s3.collegeName);
        Student.printInfo();
        
    }
}

class Student{
    String name;
    static int age=10;
    static String collegeName="DYPTC";
    
    static void printInfo(){
        System.out.println("This is a static method & age:"+age);
    }

}