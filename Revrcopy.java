public class Revrcopy {
    public static void main(String[] args) {
        int a1[]={1,2,3,4,5,6,7,8,9,10};
        System.out.println("the given array in a1:-");
        for(int k:a1){
            System.out.print(k+" ");
        }

        int b2[]=new int[10];

        for(int i=a1.length-1,j=0;i>=0;i--,j++){
            b2[j]=a1[i];
        }

        System.out.println();
        System.out.println("the revesre of the array coppied to b2:-");
        for(int k:b2){
            System.out.print(k+" ");
        }
    }
}
