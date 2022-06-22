package Q4;

public class Bank {
    int saving = 0;

    Bank(int deposit){
        this.saving = deposit;
    }

    int getBalance(){
        return this.saving;
    }
}
