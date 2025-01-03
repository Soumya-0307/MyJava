public class Formated {
    public static void main(String[] args){
        int x=10;
        float y=97.889f;
        char alpha='A';
        String str="hello soumya";

        // normal way of representaion of output in java.
        System.out.println("the output are:"+x+","+y+","+alpha+","+str);
        System.out.print("the output are:"+x+","+y+","+alpha+","+str);

        System.out.println();

        System.out.printf("the output are: %-1d %ef %3c %s",x,y,alpha,str);




    }
}
