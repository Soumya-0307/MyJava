class Cylinder{
    private int radius;
    private int height;

    public int getRadius(){
        return radius;
    }
    public int getHeight(){
        return height;
    }

    public void setHeight(int h){
        if(h>0)
           height=h;
           else
               height=1;
    }

    public void setRadius(int r){
        if(r>0)
           radius=r;
        else
           radius=1;
    }

    public void setDimension(int h,int r){
        radius=r;
        height=h;
    }

   

    public Cylinder(int r,int h){
        height=h;
        radius=r;
    }
    public Cylinder(){
        radius=2;
        height=5;
    }


    public double csa(){
        return 2*Math.PI*radius*height;
    }
    public double tsa(){
        return 2*Math.PI*radius*(height+radius);
    }



}

public class Cylinderss {
    public static void main(String[] args) {

        Cylinder c=new Cylinder(5,10);

        System.out.println("the radius is:"+c.getRadius());
        System.out.println("the height is:"+c.getHeight());
        System.out.printf("the Curved surface area of the cylinder:%.2f\n",c.csa(),"\n");
        System.out.printf("the Total surface of the cylinder is:%.2f\n",c.tsa(),"\n");

        
        
    }
}
