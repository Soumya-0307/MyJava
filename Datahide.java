class Diagram{
    private double length;
    private double breadth;

    public double getLength(){
        return length;
    }
    public double getBreadth(){
        return breadth;
    }

    public void setLength(double l){
        if(l>0){
            length=l;
        }else{
            length=0;
        }
    }
    public void setBreadth(double b){
            if(b>0){
                breadth=b;
            }    else{
                breadth=0;
            }
    }

    public double  area(){
        return getBreadth()*getLength();
    }
    public double perimeter(){
        return 2*(length+breadth);
    }
}
public class Datahide {
    public static void main(String[] args) {
        Diagram d=new Diagram();
        d.setBreadth(9);
        d.setLength(15.5);
        System.out.println("Breadth:"+d.getBreadth());
        System.out.println("Length:"+d.getLength());
        System.out.println("the area is:"+d.area());
        System.out.println("the perimeter is:"+d.perimeter());
    }
}
