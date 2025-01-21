public class Website {
    public static void main(String args[]){
        String str="https://www.google.org";

        int n=str.lastIndexOf('.');
        // System.out.println(n);

        String type=str.substring(n+1, str.length());
        System.out.print("the type of website it is using :");

        System.out.println(type);

        if(type.equals("com")){
             System.out.println("commericial website.");
        }
        else if (type.equals("org")) {
            System.out.println("organization website.");  
        }
        else if (type.equals("net")) {
            System.out.println("network website.");  
        }else{
            System.out.println("some other website.");
        }

        int m=str.indexOf(':');
        // System.out.println(m);/

        System.out.print("the type of the protocal used is:");
        String str1=str.substring(0, m);
        System.out.println(str1);

        if(str1.equals("http")){
            System.out.println("hyper text transfer protocol.");
        }
        else if(str1.equals("https")){
            System.out.println("hyper text transfer protocol secured.");
        }
        else if(str1.equals("ftp")){
            System.out.println("file transfer protocol");
        }else{
            System.out.println("somw other website");
        }




    }
}
