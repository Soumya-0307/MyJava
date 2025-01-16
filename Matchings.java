// import java.util.*;
public class Matchings {
        public static void sub(String str){
                  int i=str.indexOf('@');
                  String user=str.substring(0, i)  ;
                  String domain=str.substring(i+1,str.length());
                  System.out.println("username is:"+user+" the domain it belongs: "+domain);

                  System.out.println(domain.startsWith("gmail"));
        }
    public static void main(String args[]){
        String str="soumyahegde652@gail.com";
       
        sub(str);

    }
}
