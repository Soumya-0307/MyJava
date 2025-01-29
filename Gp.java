import java.util.*;
public class Gp {
   public static void main(String[] args) {
    int a,r,n;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the values of a,r and n");
    a=sc.nextInt();
    r=sc.nextInt();
    n=sc.nextInt();
    
    System.out.print(a+" ");

    for(int i=1;i<n;i++){
        a=a*r;
        System.out.print(a+" ");

    }
     sc.close();

   } 
}
