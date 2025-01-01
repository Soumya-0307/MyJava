import java.util.*;

public class Swapping {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of a:");
        int a=sc.nextInt();
        System.out.println("enter the value of b:");
        int b=sc.nextInt();
        
        System.out.println("the value of a and b before swapping:"+a+" "+b);
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("the value of a and b after swapping:"+a+" "+b);

        
        sc.close();
    }
}
