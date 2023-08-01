package Bank;

import Bank.Exeptions.ShortageFundsException;
import Bank.Exeptions.InvalidAmountException;
import Bank.Exeptions.MaxBalanceExceededException;

/**
 * класс runBank содержит транзакции со средствами на счетах.
 * CurrentAccount - текущий банковский счет.
 * TargetAccount - целевой банковский счет.
 */
public class runBank {
    public static void main(String[] args) {
        BankAccount CurrentAccount = new BankAccount(1000, 2000);
        BankAccount TargetAccount = new BankAccount(2000, 3000);

        Thread transaction1 = new Thread(() -> {
            try {
                CurrentAccount.deposit(1000);
                TargetAccount.withdraw(10);
                System.out.println("Транзакция 1 успешная.");
            } catch (MaxBalanceExceededException | ShortageFundsException | InvalidAmountException e) {
                System.out.println(e.getMessage());
            }
        });

        Thread transaction2 = new Thread(() -> {
            try {
                CurrentAccount.deposit(500);
                TargetAccount.withdraw(10);
                System.out.println("Транзакция 2 успешная.");
            } catch (MaxBalanceExceededException | ShortageFundsException | InvalidAmountException e) {
                System.out.println(e.getMessage());
            }
        });

        Thread transaction3 = new Thread(() -> {
            try {
                CurrentAccount.deposit(600);
                TargetAccount.withdraw(100);
                System.out.println("Транзакция 3 успешная.");
            } catch (MaxBalanceExceededException | ShortageFundsException | InvalidAmountException e) {
                System.out.println(e.getMessage());
            }
        });

        Thread transaction4 = new Thread(() -> {
            try {
                CurrentAccount.deposit(200);
                TargetAccount.withdraw(300);
                System.out.println("Транзакция 4 успешная.");
            } catch (MaxBalanceExceededException | ShortageFundsException | InvalidAmountException e) {
                System.out.println(e.getMessage());
            }
        });

        Thread transaction5 = new Thread(() -> {
            try {
                CurrentAccount.deposit(0);
                TargetAccount.withdraw(400);
                System.out.println("Транзакция 5 успешная.");
            } catch (MaxBalanceExceededException | ShortageFundsException | InvalidAmountException e) {
                System.out.println(e.getMessage());
            }
        });

        Thread transaction6 = new Thread(() -> {
            try {
                CurrentAccount.deposit(50);
                TargetAccount.withdraw(200);
                System.out.println("Транзакция 6 успешная.");
            } catch (MaxBalanceExceededException | ShortageFundsException | InvalidAmountException e) {
                System.out.println(e.getMessage());
            }
        });

        Thread transaction7 = new Thread(() -> {
            try {
                CurrentAccount.deposit(-10);
                TargetAccount.withdraw(-100);
                System.out.println("Транзакция 7 успешная.");
            } catch (MaxBalanceExceededException | ShortageFundsException | InvalidAmountException e) {
                System.out.println(e.getMessage());
            }
        });

        transaction1.start();
        transaction2.start();
        transaction3.start();
        transaction4.start();
        transaction5.start();
        transaction6.start();
        transaction7.start();
    }
}