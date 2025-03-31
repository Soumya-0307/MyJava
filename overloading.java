public class overloading {
    static void reverse(int x){
        int rev=0;
        int r;
        while(x>0){
            r=x%10;
            rev=rev*10+r;
            x=x/10;
        }
        System.out.println(rev);
    }

    static void reverse(int a[]){
        int b[]=new int[a.length];
        for(int i=a.length-1,j=0;i>=0;i--,j++){
            b[j]=a[i];
        }
        for(int x:b){
        System.out.print(x+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int num[]={1,2,3,4};
        int number=1234;
        System.out.println("reverse of the array are:");
        reverse(num);
        System.out.println("reverse of the number is:");
        reverse(number);
        
    }
}
