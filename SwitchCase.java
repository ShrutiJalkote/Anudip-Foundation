import java.util.Scanner;

@SuppressWarnings("resource") //to suppress the resource leak warning
public class SwitchCase{

    public static void main(StringPgm[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr num");
        int num=sc.nextInt();
        switch (num) {
            case 1:
                System.out.println("Good Morning");
                break;
            case 2:
                System.out.println("Namaste");
                break;
            case 3:
                System.out.println("Bonjour");
                break;
            default:
                System.out.println("Invalid input");
        }

    }
}