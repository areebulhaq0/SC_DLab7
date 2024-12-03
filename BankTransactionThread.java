package lab7;

public class BankTransactionThread extends Thread {
    private BankAccount account;
    private double amount;
    private String transactionType;

    public BankTransactionThread(BankAccount account, double amount, String transactionType) {
        this.account = account;
        this.amount = amount;
        this.transactionType = transactionType;
    }

    @Override
    public void run() {
        try {
            if (transactionType.equals("deposit")) {
                account.deposit(amount);
            } else if (transactionType.equals("withdraw")) {
                account.withdraw(amount);
            }
            Thread.sleep(1000);  // Simulating time taken for transaction
        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName() + " was interrupted.");
        }
    }
}
