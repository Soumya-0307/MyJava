class Products{
    String itmno;
    String name;
    double price;
    int qty;

    public String getName(){
          return name;
    }
    public String getItemno(){
        return itmno;
    }

   
    public double getPrice(){
        return price;

    }
    public double getqty(){
        return qty;
    }

    public void setPrice(double price){
        if(price>0)
        this.price=price;
        else
            this.price=100;
    }
    public void setQty(int qty){
        if(qty>0)
        this.qty=qty;
        else
            this.qty=1;
    }

    public Products(String no){
        itmno=no;
    }
    public Products(String no,String nam){
          itmno=no;
          name=nam;
    }

    public Products(String no,String name,int qt,double pr){
        itmno=no;
        this.name=name;
        setPrice(pr);
        setQty(qt);
  }


}
public class Product {
    public static void main(String[] args) {

        Products p=new Products("A123d4","mobile",3,5600);
        System.out.println("the itemno is:"+p.getItemno());
        System.out.println("the item name  is:"+p.getName());
        System.out.println("the Quantity is is:"+p.getqty());
        System.out.println("the price is:"+p.getPrice());

        Products p1=new Products("A134y4","laptop");
        System.out.println("the itemno is:"+p1.getItemno());
        System.out.println("the item name  is:"+p1.getName());
        System.out.println("the Quantity is is:"+p1.getqty());
        System.out.println("the price is:"+p1.getPrice());



    }
}
