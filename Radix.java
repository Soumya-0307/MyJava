public class Radix {
    public static void main(String args[]){
        String str="A27B";

        if(str.matches("[0-1]+")){
                 System.out.println("It is a Binary number radix is 2.");
        }
        else if(str.matches("[0-7]+")){
            System.out.println("it is a octal number radix is 8.");
         }
        else if (str.matches("[0-9]+")) {
                System.out.println("it is decimal number radix is 10.");
        }
        
        else if (str.matches("[0-9A-F]+")) {
            System.out.println("it is a hexadecimal  number radix is 16.");
        }
        else  {
        System.out.println("invalid number.");
            
        }
           
        
    }
}
