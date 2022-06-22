package Q4;

public class Main {
    public static void main(String[] args) {
        BankA bankA = new BankA(1000);
        System.out.println("Deposit in Bank A is: " + bankA.getBalance());

        BankB bankB = new BankB(1500);
        System.out.println("Deposit in Bank B is: " +bankB.getBalance());

        BankC bankC = new BankC(2000);
        System.out.println("Deposit in Bank C is: " +bankC.getBalance());

    }
}
