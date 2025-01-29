public class Nestedstar {
    public static void main(String[] args) {
        System.out.println("star pattern 1:");
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){

                    if(j>=i){
                    System.out.print("*"+" ");
                    }else{
                        System.out.print("  ");
                    }
            }
            System.out.println();
        }


        System.out.println();
        System.out.println();
        System.out.println("star pattern 2:");

        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                if(j>=5-i+1){
                System.out.print("*"+" ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();

        }

    }
}
