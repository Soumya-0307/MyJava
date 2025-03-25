public class Incresize {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        int b[]=new int[2*a.length];

        System.out.println("the length of the array a is: "+a.length);
        System.out.println("the length of the array b is: "+b.length);


        for(int i=0;i<a.length;i++){
            b[i]=a[i];
        }

        a=b;
        b=null;

        System.out.println("the length of the array after increasing the a size  is: "+a.length);


    }
}
