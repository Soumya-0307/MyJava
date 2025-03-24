import java.util.*;
public class Arrprobm2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[]={3,8,9,10,78,56,89,34};
        int key=7;

        for(int i=0;i<a.length;i++){
            if(key==a[i]){
                System.out.println("element found at the location:"+ (i+1));
                System.exit(0);
            }
        }
        System.out.println("key not found.");


        sc.close();
    }
    
}
