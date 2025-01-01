import java.util.*;
public class Cuboi {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int length,breadth,height;
        System.out.println("enter the length and breadth of the cuboid:");
        length=sc.nextInt();
        breadth=sc.nextInt();
        height=sc.nextInt();

        int area=2*(length*breadth+breadth*height+length*height);

        int vloume=length*breadth*height;

        System.out.println("The area of the cuboid: "+area+" and the volume is: "+vloume);
sc.close();
    }
}
