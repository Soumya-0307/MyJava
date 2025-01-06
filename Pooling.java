public class Pooling {
    public static void main(String args[]){
        String str1="java";
        String str2="java";

        System.out.println(str1==str2);     //it both refered to the same object in the memory pool 


        String str3="soumya";
        String str4=new String("soumya");        //in this the str4 created in the memory heap so soumya is not equal.
        System.out.println(str3==str4);

    }
}
