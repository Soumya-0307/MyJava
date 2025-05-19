class Rectangle{
     int lengthh;
     int breadthh;

    Rectangle(){
        lengthh=breadthh=1;
    }

    Rectangle(int length,int breadth){
        lengthh=length;
        breadthh=breadth;
    }

    double area(){
        return lengthh*breadthh;
    }
}

class Cuboid extends Rectangle{
    int height;

    Cuboid(){
        height=1;
    }

    Cuboid(int height){
        this.height=height;
    }

    Cuboid(int length,int breadth,int height){
        super(length,height);
        this.height=height;
    }
    double volumee(){
        return lengthh*breadthh*height;
    }
}

public class Paraminherit {
    public static void main(String[] args) {
        Rectangle r=new Rectangle();
        System.out.println("the area of the rectangle:"+r.area());


        Rectangle r1=new Rectangle(2,3);
        System.out.println("the area of the rectangle:"+r1.area());
        
        Cuboid c=new Cuboid();
        System.out.println("the volume of the cuboid is:"+c.volumee());

        Cuboid c1=new Cuboid(3,5,10);
        System.out.println("the volume of the cuboid is:"+c1.volumee());
    }
}
