public class Nested2 {
    public static void main(String[] args) {
        int k=1;
        System.out.println("patterns 1:");
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.format("%02d ",k);
                k++;
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        System.out.println("patterns 2:");

        for(int i=0;i<=5;i++){
            for(int j=1;j<=5-i;j++){
                System.out.print(j+" ");
                
            }
            System.out.println();
        }

    }
}
