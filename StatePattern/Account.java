public class Account {
    private String accountNumber;
    private Double balance;
    private AccountState accountState;

    public Account(String accountNumber, Double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountState = new ActiveState(); // Initial state is Active [cite: 93]
    }

    public void setState(AccountState accountState) { this.accountState = accountState; }
    public Double getBalance() { return balance; }
    public void setBalance(Double balance) { this.balance = balance; }

    public void deposit(Double amount) { accountState.deposit(amount, this); }
    public void withdraw(Double amount) { accountState.withdraw(amount, this); }
    public void suspend() { accountState.suspend(this); }
    public void activate() { accountState.activate(this); }
    public void close() { accountState.close(this); }

    @Override
    public String toString() {
        return "Account Number: " + accountNumber + ", Balance: " + balance; [cite: 88]
    }
}