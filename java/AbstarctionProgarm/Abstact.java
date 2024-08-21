package AbstarctionProgarm;

abstract  class Rock{
    abstract void HDFC();
    abstract void MAHARASHTRA();
    void  Saja(){
        System.out.println("Ok Abstact con");
    }

}
class Bank extends Rock{

    void Kotak(){
        System.out.println("Created kotak Account");
    }

    @Override
    void HDFC() {
        System.out.println("Created HDFC ACC");
    }

    @Override
    void MAHARASHTRA() {

    }
}
public class Abstact {
    public static void main(String[] args) {
        Bank Ab=new Bank();
        Ab.HDFC();
        Ab.Saja();
        Ab.Kotak();
    }
}
