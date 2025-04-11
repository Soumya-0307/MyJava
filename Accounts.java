class Accounting{
    String accno;
    String accname;
    protected double balance;

    public String getAccno(){
        return accno;
    }
    public String getAccname(){
          return accname;
    }
    public double getBalance(){
        return balance;
    }

    public Accounting(){
        accno="123B90001123";
        accname="soumya hegde";
        balance=25000;
    }

    public Accounting(String accno,String accname,double balance){
        this.accno=accno;
        this.accname=accname;
        this.balance=balance;
    }
}


class Savings extends Accounting{
    private int intrestrate;
private int time;

public int getIntrestrate(){
    return intrestrate;
}
public int getTime(){
    return time;
}

public Savings(int intrestrate,int time){
    this.intrestrate=intrestrate;
    this.time=time;
}

public Savings(){
    intrestrate=3;
    time=5;
}

    public double calcualte(){
        return  (balance*time*intrestrate)/100;
    }

    public double deposit(double depo){
        return balance+depo;
    }

    public void withdraw(double with){
        if(with>balance){
            System.out.println("low balance!!!");
        }else{
        System.out.println(balance-with);
        }

    }



}

class Loan extends Accounting{
    double loanamt;
    int rate;
    int loantime;

    public double getLoanamt(){
        return loanamt;
    }

    public int getRate(){
        return rate;
    }

    public int getLoantime(){
        return loantime;
    }

    public Loan(){
        loanamt=50000;
        rate=5;
        loantime=10;
    }

    public Loan(double loanamt,int rate,int loantime){
        this.loanamt=loanamt;
        this.rate=rate;
        this.loantime=loantime;
    }

    public double payemi(){
        return  ((balance*rate)*(1+rate))/((1+rate)-1);
    }


}
public class Accounts {
    public static void main(String[] args) {
        Accounting ac=new Accounting();
        Savings s=new Savings();

        System.out.println("the account holder name:"+ac.getAccname());
        System.out.println("the account number:"+ac.getAccno());
        System.out.println("the account balance:"+ac.getBalance());
        s.withdraw(3000);

        System.out.println("the money after depositing :"+s.deposit(2000));
        

        System.out.println("the intrest rate money:"+s.calcualte());

        Loan l=new Loan();

        System.out.println("the monthly EMI:"+l.payemi());

    }
    
}
