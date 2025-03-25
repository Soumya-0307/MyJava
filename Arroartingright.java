public class Arroartingright {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,7,8,9,10};
        System.out.println("The given array:");
        for(int k:a)
           System.out.print(k+" ");
           
        int temp=a[a.length-1];

        for(int i=a.length-1;i>0;i--){
            a[i]=a[i-1];
        }

        a[0]=temp;

        System.out.println();
        System.out.println("The rotated array");
        for(int k:a)
           System.out.print(k+" ");



    }
    
}
