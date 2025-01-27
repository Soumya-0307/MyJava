public class Amstrong {
    public static void main(String[] args) {
        int n=153;
        int temp=n;
        int sum=0;
        int r;

        while(n>0){
            r=n%10;
            sum=sum+(r*r*r);
            n=n/10;
        }
        System.out.println(sum);

        if(sum==temp){
            System.out.println("amstrong number");
        }else{
            System.out.println("not a amstrong number");

        }


}    
}
