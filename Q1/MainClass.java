package Q1;

public class MainClass {
    public static void main(String[] args) {
        BankA a = new BankA();
        System.out.println("Deposit in Bank A is: $"+a.getBalance());
        BankB b = new BankB();
        System.out.println("Deposit in Bank B is: $"+ b.getBalance());
        BankC c = new BankC();
        System.out.println("Deposit in Bank C is: $"+c.getBalance());
    }
}
