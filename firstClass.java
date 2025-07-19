
import java.util.Scanner;

@SuppressWarnings("resource") //to suppress the resource leak warning
public class firstClass{
    public static void main(StringPgm[] args)
    {
        for (int i = 0; i < 3; i++) {
                    System.out.println("DYPTC");
            
        }
        
        int a = 10;
        int b = 20;
        float sum = a+b;
        System.out.println("Result:"+sum);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr c & d");
        int c = sc.nextInt();
        int d = sc.nextInt();
        int res=c+d;
        System.out.println("Result:"+res);
    }


}