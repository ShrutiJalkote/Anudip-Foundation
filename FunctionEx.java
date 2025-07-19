import java.util.Scanner;
public class FunctionEx{
    public static void main(StringPgm[] args) {
        printMyName("Shruti");
    
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int n1 = sc.nextInt();
        System.out.println("Enter second number");
        int n2 = sc.nextInt();
        System.out.println("Addition: "+add(n1,n2));
        System.out.println("Enter number");
        int num = sc.nextInt();
    
        System.out.println("Prime or not: "+isPrime(num));

        System.out.println("Reverse: "+reverseNum(num));

        System.out.println("Palindrome or not:"+ispalindrome(num));

        System.out.println("Enter num");
        int n = sc.nextInt();
        System.out.println("Fibonnacci:"+Fibonacci(n));

        System.out.println("Enter num");
        int a=sc.nextInt();
        for(int i=0; i<=a; i++)
        {
            System.out.print(recursiveFibonnaci(i)+" ");
        }
    }

    public static void printMyName(StringPgm name)
    {
        System.out.println("My name is "+name );

    }

    public static int add(int a, int b)
    {
        return a+b;
    }

    public static boolean isPrime(int n)
    {
        if(n<=1) 
        {
            return false;
        }
        int temp1=0;
        for(int i=2; i<=n; i++)
        {
            if(n%i==0)
            {
                temp1++;
                
            }
        }
        if(temp1==1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
        
        public static int reverseNum(int n)
        {
            int rev=0;
            while(n!=0)
            {
                int rem=n%10;
                rev=rev*10+rem;
                n=n/10;
            }
            return rev;
        }

        public static int ispalindrome(int n)
        {
            int rev=0;
            int temp=n;
            while(n!=0)
            {
                int rem=n%10;
                rev=rev*10+rem;
                n=n/10;
            }
            if(temp==rev)
            {
                return 1;
            }
            else
            {
                return 0;
            }
        }

        public static int Fibonacci(int n){
            int dig1=0;
            int dig2=1;
            int dig3;
            for(int i=0; i<=n; i++)
            {
                System.out.println(dig1+" ");
                dig3=dig1+dig2;
                dig1=dig2;
                dig2=dig3;
            }
            return dig1; 
        }

        public static int recursiveFibonnaci(int num){
            if(num<=1)
            {
                return num;
            }
            else
            {
                return recursiveFibonnaci(num-1)+recursiveFibonnaci(num-2);
            }
        }
}