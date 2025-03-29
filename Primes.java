public class Primes {
    boolean primess(int x){
        if(x==1 | x==0){
            return false;
        }


        if(x==2){
            return true;
            
        }

       
            for(int i=2;i<Math.sqrt(x);i++){
                    if(x%i==0){
                        return false;
                    }
            }
            return true;    
    }

    

    public static void main(String[] args) {
        Primes p=new Primes();
        int number=997;
        
        boolean isprime=p.primess(number);
        if(isprime==false){
            System.out.println(number+" is not a prime number.");
        }
        else{
            System.out.println(number+" is a prime number.");

        }
        
    }
}
