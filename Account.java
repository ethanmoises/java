public class Account {
    String accountNumber;
    String accountName;
    Integer accountPin;
    Double balance;
    void withdrawal(Double amount) {
        if (amount > balance) {
            throw new RuntimeException("Exceeded limit. You have overdraft");
        }
        balance = balance - amount;
    }

    void deposit(Double amount) {
        balance = balance + amount;
    }
}


