public class Leap {
    public static void main(String args[]){
        int number=2000;

        if(number%4==0 && number%100!=0)
        {
            System.out.println("it is a leap year.");
        }
        

           else if(number%100==0 && number%400==0){
                System.out.println("it is a leap year.");
            }

            else{
                System.out.println("it is not a leap year.");  
            }
        
        
        
                
    }
}
