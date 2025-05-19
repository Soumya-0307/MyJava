class Rectangle{
    int length;
    int breadth;

    Rectangle(int length,int breadth){
        this.length=length;
        this.breadth=breadth;
    }

    void dispaly(){
        System.out.println("length of the reactngle: "+this.length);
        System.out.println("breadth of the reactngle: "+this.breadth);

    }


}




public class Thiss {
    public static void main(String args[]){
        Rectangle r1=new Rectangle(25, 30);
        r1.dispaly();

        Rectangle r2=new Rectangle(5, 3);
        r2.dispaly();

    }
}
