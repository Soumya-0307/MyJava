public class Removing {
    public static void main(String[] args) {
        // replacing specail charcter with the empty string the o/p is:Abdri.

        String str="Ab$d@ri*";
        System.out.println(str.replaceAll("[^a-zA-Z0-9]",""));

        String str1="abc     d   e   f ghi";  //removing the spaces that is extra spaces to replace with the single space.
        System.out.println(str1.replaceAll("[\\s]+"," "));


        String str2=" soumya Amogha Hegde ";

        str2=str2.trim();
        System.out.println(str2);

        String word[]=str2.split("\\s");

        int n=word.length;
        System.out.println(n);

    }
}
