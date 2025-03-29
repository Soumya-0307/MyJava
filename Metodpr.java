public class Metodpr {

    

    static int max(int x,int y){
        if(x>y)
            return x;
        else
            return y;
    }
      void increase(int a){
        a++;
        System.out.println(a);
    }



    public static void main(String[] args) {

        int a=10,b=20,c=90;
        System.out.println("the value of a:"+a+" the value of b:"+b);

        
Metodpr p=new Metodpr();
        p.increase(a);
        int res=max(b, c);
        System.out.println("the maximum variable is:"+res);

        
    }
}

