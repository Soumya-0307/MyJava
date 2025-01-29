import java.util.*;
public class Ap {
    public static void main(String args[]){
        int a,d,n;


        Scanner sc=new Scanner(System.in);
        System.out.println("enter the values of a,d and n");
        a=sc.nextInt();
        d=sc.nextInt();
        n=sc.nextInt();

        int term=a;
        System.out.print(term+" ");
        for(int i=1;i<n;i++){
            term=term+d;
            System.out.print(term+" ");
        }
        sc.close();

    }
}
