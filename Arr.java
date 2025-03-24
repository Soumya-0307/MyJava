
import java.util.*; 
public class Arr {
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the limits of the array:");
    int n=sc.nextInt();
        int a[]=new int[n];

        System.out.println("entere array elements one bye one:");


        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }

        System.out.println("the entered array elements are:");
        for(int x:a){
            System.out.print(x+" ");
        }
        sc.close();
    }
}
