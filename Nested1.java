public class Nested1 {
    public static void main(String[] args) {
        System.out.println("pattern 1:");
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();
        System.out.println("pattern 2:");
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();
        System.out.println("pattern 3:");
        for(int i=1;i<=5;i++){
            
            for(int j=1;j<=5;j++){
                System.out.print(i+j+" ");
                
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();
        System.out.println("pattern 4:");
        int k=1;
        for(int i=1;i<=5;i++){
            
            for(int j=1;j<=5;j++){
                System.out.format("%02d ",k);
                k++;
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();
        System.out.println("pattern 5:");
        
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }


    }
}
