public class Loops{
    public static void main(String[] args)
    {
        for (int i = 0; i < 5; i++) 
        {
            System.out.println("Hello World");   
        }

        System.out.println("Using while loop");
        int j=0;
        while (j < 5) 
        {
            System.out.println("Hello World");j++;
        }

        System.out.println("Using do while loop");
        int k=0;
        do
        {
            System.out.println("hello World");
            k++;
        }while(k<5);

        int num=6;
        int l;
        for (l = 1; l <= 10; l++) 
        {
                System.out.println(num*l);
            }
        
        System.out.println("Pattern 1");
        for(int p=0; p<4; p++)
        {
            for(int q=0; q<4; q++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("Pattern 2");
        for(int r=0; r<4; r++)
        {
            for(int s=0; s<=r; s++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("Pattern 3");
        for(int u=1; u<=5; u++)
        {
            for(int v=1; v<=u; v++)
            {
                System.out.print(v);
            }
            System.out.println();
        }

        System.out.println("Pattern 4");
        int n1=1;
        for(int x=1; x<=4; x++)
        {
            for(int y=1; y<=x; y++)
            {
                System.out.print(n1 +" ");
                n1=n1+1;
            }
            System.out.println();
        }

        System.out.println("Pattern 5");
        for(int a=1; a<=3; a++)
        {
            for(int b=1; b<=3-a; b++)
            {
                System.out.print(" ");
            }
            for(int c=1;c<=2*a-1;c++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("Pattern 6");
        for(int d=1; d<=4; d++)
        {
            for(int e=1; e<=d; e++)
            {
                if((d+e)%2==0){
                    System.out.print("1 ");
                } 
                else 
                {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}