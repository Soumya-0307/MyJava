import java.util.*;
public class Arrotaion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("The given array:");
        int arr[]={1,2,3,4,5,6,7,8,9};

        for(int k:arr){
            System.out.print(k+" ");
        }


        int temp=arr[0];
        System.out.println();

        System.out.println("After rotating the array:");

        for(int i=0;i<arr.length-1;i++){
               arr[i]=arr[i+1];
        }

        arr[arr.length-1]=temp;

        for(int k:arr){
            System.out.print(k+" ");
        }
        sc.close();

    }
}
