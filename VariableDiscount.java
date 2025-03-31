public class VariableDiscount {
    public static double discount(int ...a){
        int sums=0;
        for(int i=0;i<a.length;i++){
            sums=sums+a[i];
        }

          int sum=sums;
        if(sum>1000){
            return sum*0.2;
        }else if(sum<1000 & sum>500){
            return sum*0.1;
        }else
        return sum*0.05;
    }
    public static void main(String[] args) {
     System.out.println(discount());
     System.out.println(discount(50,50,50,500,500));      
     System.out.println(discount(100,200,400));      
     System.out.println(discount(100,200));      

    }
}
