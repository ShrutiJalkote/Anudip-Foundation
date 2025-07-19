public class Inheritance{
    public static void main(String[] args) {
        Shape s = new Shape();
        s.area(); 
        Triangle t = new Triangle();
        t.area();
        t.display(); 
        equilateralTriangle e = new equilateralTriangle();
        e.area();
        e.display();

    }
}

class Shape{
    void area()
    {
        System.out.println("Area");
    }
}
class Triangle extends Shape
{
    void display()
    {
        System.out.println("Display Area");
    }
    
}
class equilateralTriangle extends Triangle
{

}

