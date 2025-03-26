import java.util.*;
public class Twodarr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[][]=new int[3][3];
        int b[][]=new int[3][3];
        int c[][]=new int[3][3];

        System.out.println("enter the A matrix:");
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                a[i][j]=sc.nextInt();
            }
        }

        System.out.println("enter the B matrix:");
        for(int i=0;i<b.length;i++){
            for(int j=0;j<b[i].length;j++){
                b[i][j]=sc.nextInt();
            }
        }

        System.out.println("the A matrix are:");
        for(int x[]:a){
            for(int y:x){
                  System.out.print(y+" ");
            }
            System.out.println();
        }

        System.out.println("the B matrix are:");
        for(int x[]:b){
            for(int y:x){
                  System.out.print(y+" ");
            }
            System.out.println();
        }

        System.out.println("");
        System.out.println("the sum of the matrixes are:");

        for(int i=0;i<c.length;i++){
            for(int j=0;j<c[i].length;j++){
                c[i][j]=a[i][j]+b[i][j];
            }
        }

        for(int x[]:c){
            for(int y:x){
                System.out.print(y+" ");
            }
            System.out.println();
        }




         sc.close();


    }
}
