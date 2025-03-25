public class Copying {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,7,8,9,10};
        int b[]=new int[10];

        for(int i=0;i<a.length;i++){
               b[i]=a[i];
        }

        System.out.println("the array in 'a' are:");
        for(int k:a)
             System.out.print(k+" ");

        System.out.println();
        System.out.println("the array in 'b' are:");
        for(int k:b)
             System.out.print(k+" ");



    }
}
