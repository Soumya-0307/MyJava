import java.util.*;

public class Arrprobm3 {
    
    public static void main(String[] args) {
        int arr[]={34,67,89,90,45,23};
        System.out.print("the given array is:");
        for(int a:arr){
            System.out.print(a+" ");
        }
        System.out.println();

        Arrays.sort(arr);
        System.out.println("sorted array:"+Arrays.toString(arr));

        System.out.println("the maximum elemnt in the array is :"+ arr[arr.length-1]);
        System.out.println("the second maximum elemnt in the array is :"+ arr[arr.length-2]);

        

    }
}
