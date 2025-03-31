public class VariableArgu {
    static int max(int ...A){
        if(A.length==0)
           return Integer.MIN_VALUE;

         int m=A[0];
         for(int i=1;i<A.length;i++){
                 if(m<A[i]){
                    m=A[i];
                 }
                
         }  
         return m;

    }

    public static void main(String[] args) {
        System.out.println(max());
        System.out.println(max(10));
        System.out.println(max(10,90,112));
        System.out.println(max(-10,-90));
        System.out.println(max(20,87,3,44,90));
        
    }
}
