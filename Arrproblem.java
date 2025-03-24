import java.util.*;
public class Arrproblem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the limits of array:");
        int l=sc.nextInt();
            
        int num[]=new int[l];

        System.out.println("enter the numbers one bye one:");

        for(int i=0;i<l;i++){
             num[i]=sc.nextInt();
        }

        System.out.println("the entered elements are:");
        for(int a:num){
            System.out.print(a+" ");
        }
          System.out.println();
        System.out.println("sum of all the elements in array are:");

        int sums=0;

        for(int i=0;i<l;i++){
            sums=sums+num[i];
        }

        System.out.println(sums);


        sc.close();

    }
    
}
