import java.util.Scanner;

@SuppressWarnings("resource") //to suppress the resource leak warning
public class ifStatement{

    public static void main(StringPgm[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr num");
        int num=sc.nextInt();
        if (num == 1) 
        {
            System.out.println("Good Morning");
        } 
        else if (num == 2)
        {
            System.out.println("namste");
        } 
        else if (num == 3) 
        {
            System.out.println("Bonjour");
        } 
        else 
        {
            System.out.println("Invalid input");
        }

        int number=sc.nextInt();
        if (number %2==0) 
        {
            System.out.println("Even");
        } 
        else 
        {
            System.out.println("Odd");
        } 

    }
}