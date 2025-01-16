public class Decimalcheck {
    public static void main(String args[]){
        // int b=0b01011;
        String str="010101";
        // int hexa=0123;
        String str1="123A";

        String date="00/01/2001";


        // System.out.println(b+"  "+str);
        System.out.println(str.matches("[01]+"));
        System.out.println(str1.matches("[0-9A-F]+"));

        System.out.println(date.matches("[0-3][0-9]/[0-1][1-9]/[0-9]{4}"));





    }
}
