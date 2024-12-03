package lab7;

public class BankTransactionSystem {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);
        BankTransactionThread thread1 = new BankTransactionThread(account, 200, "deposit");
        BankTransactionThread thread2 = new BankTransactionThread(account, 150, "withdraw");
        BankTransactionThread thread3 = new BankTransactionThread(account, 500, "deposit");
        BankTransactionThread thread4 = new BankTransactionThread(account, 300, "withdraw");

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

        try {
            thread1.join();
            thread2.join();
            thread3.join();
            thread4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final balance: " + account.getBalance());
    }
}
