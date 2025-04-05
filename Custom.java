class Customer{
    String custmid;
    String name;
    String adress;
    int phonno;

    public Customer(String custmid,String name,String adress,int phonno){
        this.custmid=custmid;
        this.name=name;
        this.adress=adress;
        this.phonno=phonno;
    }

    public Customer(String custmid,String name){
        this.custmid=custmid;
        this.name=name;
    }

    public String getCustmid(){
        return custmid;
    }

    public String getName(){
        return name;
    }

    public String getAdress(){
        return adress;
    }

    public int getPhonno(){
        return phonno;
    }

public void setAdress(String a){
    adress=a;
}

public void setPhonno(int p){
    phonno=p;
}

}
public class Custom {
    public static void main(String[] args) {

        Customer c=new Customer("S23A22","Soumya","kumta",735);

        System.out.println("The customer id is:"+c.getCustmid());
        System.out.println("the customer name is:"+c.getName());
        System.out.println("the Adress is:"+c.getAdress());
        System.out.println("the phone 3 digit is:"+c.getPhonno());
        

        Customer c1=new Customer("S23A22","Soumya");

        System.out.println("The customer id is:"+c1.getCustmid());
        System.out.println("the customer name is:"+c1.getName());
        // System.out.println("the Adress is:"+c1.getAdress());
        // System.out.println("the phone 3 digit is:"+c1.getPhonno());
        
    }
}
