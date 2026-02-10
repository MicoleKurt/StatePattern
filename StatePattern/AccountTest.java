public class AccountTest {
    public static void main(String[] args) {
        Account myAccount = new Account("1234", 10000.0); [cite: 93]

        myAccount.activate(); [cite: 93]
        myAccount.suspend(); [cite: 95]
        myAccount.activate(); [cite: 97]

        myAccount.deposit(1000.0); [cite: 99]
        myAccount.withdraw(100.0); [cite: 102]

        myAccount.close(); [cite: 105]

        myAccount.activate(); [cite: 107]
        myAccount.suspend(); [cite: 109]
        myAccount.withdraw(500.0); [cite: 111]
        myAccount.deposit(1000.0); [cite: 114]
    }
}