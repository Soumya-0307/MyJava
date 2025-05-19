class Rectt{
    int length;
    int breadth;
    int x=10;

    public Rectt(int length,int breadth){
        this.length=length;
        this.breadth=breadth;
    }
}

class Cubo extends Rectt{
      int height;
      int x=90;

      public Cubo(int l,int b,int h){
        super(l,b);
        this.height=h;
      }

      void display(){
        System.out.println("the value its x is:"+x);
        System.out.println("value of the super class x:"+super.x);
        System.out.println("length:"+this.length);
        System.out.println("breadth:"+this.breadth);
        System.out.println("height:"+this.height);



      }
}


public class Superr {
    public static void main(String[] args) {
        Cubo c1=new Cubo(2,6,10);
        c1.display();
        
    }
}
