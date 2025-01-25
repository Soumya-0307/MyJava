public class SumNatural {
    public static void main(String args[]){
        int sum=0;
        System.out.println("the sum of N natural numbers:");
        for(int i=1;i<=10;i++){
             sum=sum+i;
        }
        System.out.println("the sum of first natural number is:"+sum);

        System.out.println("if you know the limits:then formula (n*(n+1))/2)");
        int n=20;

        int sums=(n*(n+1))/2;
        System.out.println("the sum of numbers from 1-20 using formula:"+sums);


    }
}
