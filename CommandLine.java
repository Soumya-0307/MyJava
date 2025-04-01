public class CommandLine {
    public static void main(String[] args) {
       double s=0;
       for(int i=0;i<args.length;i++){
        if(args[i].matches("[0-9\\.]+"))
          s=s+Double.parseDouble(args[i]);
       }
       System.out.println("the sum of the arguments are:"+s);
    }
}
