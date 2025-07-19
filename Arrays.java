import java.util.Scanner;
public class Arrays {
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[2]=45;
        System.out.println(arr[2]);
        System.out.println("Array elements:");
        for (int i=0; i<5; i++){
            System.out.println(arr[i]);
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();
        int[] arr1 = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i=0; i<size; i++)
        {
           arr1[i]= sc.nextInt();   
        }
        System.out.println("Elements of the array:");
        for (int i = 0; i < size; i++) 
        {
            System.out.println(arr1[i]);
        }

        int [][] arr2= new int[4][4];
        System.out.println("Enter the elements of the matrix:");
        for (int i=0; i<3; i++)
        {
            for (int j=0; j<3; j++)
            {
                arr2[i][j]=sc.nextInt();
            }
        }
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }

    }
}