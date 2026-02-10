public class ActiveState implements AccountState {
    @Override
    public void deposit(Double depositAmount, Account account) {
        account.setBalance(account.getBalance() + depositAmount);
        System.out.println("Deposit successful. " + account.toString());
    }

    @Override
    public void withdraw(Double withdrawAmount, Account account) {
        account.setBalance(account.getBalance() - withdrawAmount);
        System.out.println("Withdrawal successful. " + account.toString());
    }

    @Override
    public void activate(Account account) {
        System.out.println("Account is already activated!"); [cite: 93]
    }

    @Override
    public void suspend(Account account) {
        account.setState(new SuspendedState());
        System.out.println("Account is suspended!"); [cite: 95]
    }

    @Override
    public void close(Account account) {
        account.setState(new ClosedState());
        System.out.println("Account is closed!"); [cite: 105]
    }
}