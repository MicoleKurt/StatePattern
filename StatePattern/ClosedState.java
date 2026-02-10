public class ClosedState implements AccountState {
    @Override
    public void deposit(Double depositAmount, Account account) {
        System.out.println("You cannot deposit on a closed account! " + account.toString()); [cite: 114]
    }

    @Override
    public void withdraw(Double withdrawAmount, Account account) {
        System.out.println("You cannot withdraw on a closed account! " + account.toString()); [cite: 111]
    }

    @Override
    public void activate(Account account) {
        System.out.println("You cannot activate a closed account!"); [cite: 107]
    }

    @Override
    public void suspend(Account account) {
        System.out.println("You cannot suspend a closed account!"); [cite: 109]
    }

    @Override
    public void close(Account account) {
        System.out.println("Account is already closed!");
    }
}