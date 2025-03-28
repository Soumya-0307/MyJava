import java.util.*;
public class Mularr {
    public static void main(String[] args) {
        int mtrx1[][]=new int[3][3];
        int mtrx2[][]=new int[3][3];

        Scanner sc=new Scanner(System.in);

        System.out.println("enter the array element of the first matrix");
        for(int i=0;i<mtrx1.length;i++){
            for(int j=0;j<mtrx1[i].length;j++){
                mtrx1[i][j]=sc.nextInt();
            }
        }

        System.out.println("enter the array element of the second matrix");
        for(int i=0;i<mtrx2.length;i++){
            for(int j=0;j<mtrx2[i].length;j++){
                mtrx2[i][j]=sc.nextInt();
            }
        }

        System.out.println("the first matrix elements are:");
        for(int x[]:mtrx1){
            for(int y:x){
                System.out.print(y+" ");
            }           
            System.out.println();
        }

        System.out.println("the second matrix elements are:");
        for(int x[]:mtrx2){
            for(int y:x){
                System.out.print(y+" ");
            }           
            System.out.println();
        }

        int mtrx3[][]=new int[3][3];

        for(int i=0;i<mtrx3.length;i++){
            for(int j=0;j<mtrx3.length;j++){
                for(int k=0;k<mtrx3.length;k++){
                    mtrx3[i][j]=mtrx3[i][j]+mtrx1[i][k]*mtrx2[k][j];
                }
            }
        }


        System.out.println("the matrix elements after multiplication are:");
        for(int x[]:mtrx3){
            for(int y:x){
                System.out.print(y+" ");
            }           
            System.out.println();
        }



        sc.close();




    }
}
