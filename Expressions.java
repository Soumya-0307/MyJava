import java.util.*;
public class Expressions {
    public static void main(String args[]){
       Scanner sc=new Scanner(System.in); 
System.out.println("enter the height and breadth of a triangle.");
       float breadth =sc.nextFloat();
       float height=sc.nextFloat();

       float area=(breadth*height)/2;
       System.out.println("the area of the triangle: " + area);

       sc.close();
    }
}
