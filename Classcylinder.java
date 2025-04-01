class Cylinder{
    int radius,height;

    public double lidarea(){
        return   Math.PI*radius*radius;
    }

    public double totalsarea(){
        return 2*Math.PI*radius*(radius+height);
    }
    public double volume(){
        return Math.PI*radius*radius*height;
    }
}
public class Classcylinder {
    public static void main(String[] args) {
        Cylinder c1=new Cylinder();

        c1.radius=7;
        c1.height=10;

        System.out.printf("the lid surface area of the cylinder is:%.2f\n",c1.lidarea());
        System.out.printf("the total surface area of the cylinder is:%.2f\n",c1.totalsarea());
        System.out.printf("the Volume of the cylinder is:%.2f\n",c1.volume());



        
    }
}
