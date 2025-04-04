// package constructpract;

class Rectangle{
    private double length;
    private double breadth;

    public Rectangle(){
        breadth=1;
        length=1;
    }

    public Rectangle(double l,double b){
        breadth=b;
        length=l;
    }

    public Rectangle(double s){
        breadth=length=s;
    }

    public double getLength(){
        return length;
    }
    public double getBreadth(){
        return breadth;
    }

    public void setBreadth(double b){
        breadth=b;
    }

    public void setLength(double l){
        length=l;
    }


public double area(){
    return getLength()*getBreadth();
}

public double perimeter(){
    return 2*(length+breadth);
}

}
public class main {
    public static void main(String[] args) {

        Rectangle r=new Rectangle(15);
        
        System.out.println("The perimeter: "+r.perimeter());
        System.out.println("The area: "+r.area());

        
    }
}


