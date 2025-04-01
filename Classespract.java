import java.util.*;
 class Circle{
            public  double radius;


            public  double area()
            {
                    double result=Math.PI*radius*radius;
                    return result;
            }

            public  double perimeter()
            {
                    return 2*Math.PI*radius;
            }

            public double circumference(){
                return perimeter();
            }
        
    }
public class Classespract {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // System.out.println("enter the radius of the circle:");
        // int radius=sc.nextInt();

        Circle c=new Circle();
        c.radius=7;
        System.out.println(c.area());
        System.out.println(c.perimeter());
        System.out.println(c.circumference());



        sc.close();
        
    }
}
