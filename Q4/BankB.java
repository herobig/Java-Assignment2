package Q4;

public class BankB extends Bank{

    public BankB(int deposit) {
        super(deposit);
    }

    @Override
    int getBalance() {
        return BankB.super.saving;
    }
}