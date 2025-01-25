public class Factorial {
    public static void main(String args[]){
           System.out.println("the factorial of a number:");
           int fact=1;
           for(int i=1;i<=10;i++){
            fact=fact*i;
               System.out.println("the factorial of "+i+"! is: "+fact);
           }
    }
}
