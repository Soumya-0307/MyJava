public class Stringsmethod {
    public static void main(String args[]){
         String str="Soumya Amogha Hegde";

         int len=str.length();
         System.out.println("length of the string:"+len);

         String str1=str.toLowerCase();
         System.out.println(str1);

         String str2=str.toUpperCase();
         System.out.println(str2);

         String strr="      hi    ";

         strr=strr.trim();
         System.out.println(strr);

         String str3=str.substring(7);
         System.out.println(str3);

         String str4=str.substring(7,13);
         System.out.println(str4);

         String str5=str.replace('a','l');
         System.out.println(str5);


        boolean res=str.startsWith("sou");
        System.out.println(res);

        boolean res1=str.endsWith("hegde");
        System.out.println(res1);


        char what=str.charAt(3);
        System.out.println(what);

        int whats=str.lastIndexOf("m");
        System.out.println(whats);

        String str6="soumya";
        String str7="soumya";


        boolean equalss= str6.equals(str7);
        System.out.println(equalss);

        boolean equalsscas= str6.equalsIgnoreCase(str7);
        System.out.println(equalsscas);

         



    }
}
