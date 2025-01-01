import java.util.*;
public class Quad {
    public static void main(String[] args) {
        int a,b,c;
        double r1,r2;
        Scanner sc= new Scanner(System.in);

        System.out.println("enter the value of a and b and c:");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();




        r1=(-b + Math.sqrt(b*b-(4*a*c)))/2*a;

        r2=(-b - Math.sqrt(b*b-(4*a*c)))/2*a;
        
        System.out.println("the value of r1 is :"+r1+" the value of r2 is: "+r2);
        sc.close();
        
        
    }
    
}
