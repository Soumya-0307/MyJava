public class VariableSum {
    public static int sum(int ...a){
       int sum=0;
        for(int i=0;i<a.length;i++){
               sum=sum+a[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(sum());
        System.out.println(sum(12));
        System.out.println(sum(1,2,3,4));
        System.out.println(sum(11,56));

    }
}
