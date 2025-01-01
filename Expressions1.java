import java.util.*;
public class Expressions1 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        float a,b,c;
        System.out.println("enter the three side of a traingle:");

        a=sc.nextFloat();
        b=sc.nextFloat();
        c=sc.nextFloat();

        float s=(a+b+c)*0.5f;

        float area=(float)Math.sqrt(s*(s-a)*(s-b)*(s-c));

        System.out.println("area of the trainagle:"+area);



        

        sc.close();


    }
}
