public class Passobject {
    
    static void update(int x[],int index,int value){
        x[index]=value;
    }
    
    
    public static void main(String[] args) {
        int a[]={1,2,3,4};
        System.out.println("the array before passing into method");

        for(int y:a){
            System.out.print(y+" ");
        }
        System.out.println();
           
        System.out.println("the array after passing into method");
        int indexx=2;
        int values=20;
        update(a,indexx,values);

        for(int y:a){
            System.out.print(y+" ");
        }


    }
}
