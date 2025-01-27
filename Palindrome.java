public class Palindrome {
    public static void main(String args[]){
        int n=11211;
        int temp=n;
        int rev=0;
        int r=0;

        while(n>0){
            r=n%10;
            rev=rev*10+r;
            n=n/10;
        }

        System.out.println(rev);

        if(rev==temp){
            System.out.println("it is a palindrome");
        }else{
            System.out.println("not a plaindrome");
        }
    }
}
