package Q4;

public class BankA extends Bank{

    public BankA(int deposit) {
        super(deposit);
    }

    @Override
    int getBalance() {
        return BankA.super.saving;
    }
}
