import java.util.*;
public class Menu {
    public static void main(String args[]){
        System.out.println("Menu:");
        System.out.println("========");
        System.out.println("ADD");
        System.out.println("SUB");
        System.out.println("MUL");
        System.out.println("DIV");

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the value of a:");
        int a=sc.nextInt();
        System.out.println("Enter the value of b:");
        int b=sc.nextInt();

        sc.nextLine();

        System.out.println("Enter the operation perform from the above menu:");
        String str=sc.nextLine();
        str=str.toUpperCase();

        switch(str){
            case "ADD":
            System.out.println("the sum of  a and b is: "+(a+b));
            break;
            case "SUB":
            System.out.println("the difference of  a and b is: "+(a-b));
            break;
            case "MUL":
            System.out.println("the product of  a and b is: "+(a*b));
            break;
            case "DIV":
            System.out.println("the division of  a and b is: "+(a/b));
            break;
            default:System.out.println("invalid choice.");


        }


        sc.close();
    }
}
