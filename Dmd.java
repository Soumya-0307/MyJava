class Super {
    public void Display(){
        System.out.println("hello soumya");
    } 
}

class Sub extends Super{
    
    public void Display(){
        System.out.println("Hello Soumya Amogha Hegde");
    }
}
public class Dmd {
    public static void main(String[] args) {
        Super sup=new Super();
        sup.Display();

        Sub sb=new Sub();
        sb.Display();

        Super sp=new Sub();
        sp.Display();
        
    }
}
