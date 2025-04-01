class Rectangle{
    public double length,breadth;

    public double area(){
        return length*breadth;
    }

    public double perimeter(){
        return 2*(length+breadth);
    }

    public boolean issquare(){
        return length==breadth;
    }
}





public class Classrect {
    public static void main(String[] args) {
        Rectangle r1=new Rectangle();
        r1.length=3;
        r1.breadth=4;

        Rectangle r2=new Rectangle();
        r2.length=7;
        r2.breadth=7;

        System.out.println("the area of the rectangle1 is:"+r1.area());
        System.out.println("the perimeter of the rectangle1 is:"+r1.perimeter());
        System.out.println("is it a square? :"+r1.issquare());

        System.out.println();
        System.out.println();

        System.out.println("the area of the rectangle2 is:"+r2.area());
        System.out.println("the perimeter of the rectangle2 is:"+r2.perimeter());
        System.out.println("is it a square? :"+r2.issquare());


        
    }
}
