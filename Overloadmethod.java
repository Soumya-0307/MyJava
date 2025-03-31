import java.util.*;
public class Overloadmethod {
    static double area(int l,int b){
        return l*b;
    }
    static double area(int r){
        return Math.PI*r*r;
    }

    static double area(int a,int b,int h){
             return 0.5*(a+b)*h;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x,y,z;
        System.out.println("enter the input to calculate the area of the given diagram:");
        x=sc.nextInt();
        y=sc.nextInt();
        z=sc.nextInt();
        System.out.println("the area of the rectangle is:"+area(x,y));
        System.out.println("the area of the trapezium is:"+area(x,y,z));
        System.out.println("the area of the circle is:"+area(x));


        sc.close();
        
    }
}
