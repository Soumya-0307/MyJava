 class Circle{
    public double radius=2.5;
    public double area(){
        return Math.PI*radius*radius;
    }
    public double perimeter(){
        return 2*Math.PI*radius;
    }
}

class Cylinder extends Circle{
    public double height=10;

    public double volume(){
        return area()*height;
    }
    
}
public class Inheritancecylinder {
    public static void main(String args[]){
           Cylinder c=new Cylinder();
        //    c.height=10;
        //    c.radius=2.5;

           System.out.println("the cylinder volume is:"+c.volume());
           System.out.println("the area of the circle is:"+c.area());
    }
}
