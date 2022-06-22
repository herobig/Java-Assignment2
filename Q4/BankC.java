package Q4;

public class BankC extends Bank{

    public BankC(int deposit) {
        super(deposit);
    }

    @Override
    int getBalance() {
        return BankC.super.saving;
    }
}
