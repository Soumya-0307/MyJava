public class Fibonacci {
    public static void main(String[] args) {
        int s1=0;
        int s2=1;
        int n=8;

        System.out.print(s1+","+s2+",");
        for(int i=1;i<n-1;i++){
            int s3=s1+s2;
            System.out.print(s3+",");
            s1=s2;
            s2=s3;
        }
    }
}
