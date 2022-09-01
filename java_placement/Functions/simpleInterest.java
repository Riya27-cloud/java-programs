package Functions;

public class simpleInterest {
    public void sI(){
        int P = 2300, R= 2, T=1;
        double SI = (P*R*T)/100;
        System.out.println(SI);
    }
    public static void main(String[] args) {
        simpleInterest obj = new simpleInterest();
        obj.sI();
    }
}
