public class Gcd {
    static int gcdd(int m,int n){
        
        while(m!=n){
            if(m>n){
                m=m-n;
            }else{
                n=n-m;
            }
        }
        return m;
        
    }

    public static void main(String[] args) {
        int a=35;
        int b=56;
        int result=gcdd(a, b);

        System.out.println("the greatest common divisor among "+a+" and "+b+" is:"+result);
        
    }
}
