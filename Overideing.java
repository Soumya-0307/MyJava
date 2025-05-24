class Tv{
    public void switchon(){
        System.out.println("Tv is switched on.");
    }
    public void switchedof(){
        System.out.println("the tv is switched off now");
    }
}

class Smarttv extends Tv{
    public void switchon(){
        System.out.println("smart tv is switched on.");
    }
    public void switchedof(){
        System.out.println("The smart tv is turnoff");
    }
    public void browse(){
        System.out.println("the smart tv is browsing");
    }
}
public class Overideing {
    public static void main(String[] args) {
        Tv t=new Tv();
        Smarttv st=new Smarttv();
        st.browse();
        st.switchon();
        st.switchedof();

        t.switchedof();
        t.switchon();

        Tv tt=new Smarttv();

        tt.switchedof();
        tt.switchon();

        
    }
}
