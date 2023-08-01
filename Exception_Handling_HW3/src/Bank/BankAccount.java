package Bank;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import Bank.Exeptions.ShortageFundsException;
import Bank.Exeptions.InvalidAmountException;
import Bank.Exeptions.MaxBalanceExceededException;

/**
 * класс BankAccount представляет банковский счет с балансом и максимальным
 * допустимым балансом.
 */
public class BankAccount {
    private double balance;
    private double maxBalance;
    private Lock lock;

    /**
     * Создает новый банковский счет с заданным максимальным допустимым балансом.
     *
     * @param balance    начальный баланс для счета
     * @param maxBalance максимальный допустимый баланс для счета
     */
    public BankAccount(double balance, double maxBalance) {
        this.balance = balance;
        this.maxBalance = maxBalance;
        this.lock = new ReentrantLock();
    }

    /**
     * метод deposit пополняет счет на указанную сумму.
     *
     * @param amount сумма для пополнения
     * @throws MaxBalanceExceededException выбрасывается, если сумма пополнения
     *                                     превышает максимальный допустимый баланс.
     * @throws InvalidAmountException      выбрасывается, если сумма перевода
     *                                     отрицательная или равна нулю.
     */
    public void deposit(double amount) throws MaxBalanceExceededException, InvalidAmountException {
        if (amount <= 0) {
            throw new InvalidAmountException("Некорректная сумма перевода.");
        }

        lock.lock();
        try {
            if ((balance + amount) > maxBalance) {
                throw new MaxBalanceExceededException("Превышен допустимый баланс на счете.");
            }
            balance += amount;
        } finally {
            lock.unlock();
        }
    }

    /**
     * метод withdraw снимает со счета указанную сумму.
     *
     * @param amount сумма для снятия
     * @throws ShortageFundsException выбрасывается, если на балансе
     *                                недостаточно средств для перевода.
     * @throws InvalidAmountException выбрасывается, если сумма перевода
     *                                отрицательная или равна нулю.
     */
    public void withdraw(double amount) throws ShortageFundsException, InvalidAmountException {
        if (amount <= 0) {
            throw new InvalidAmountException("Некорректная сумма перевода.");
        }

        lock.lock();
        try {
            if (amount > balance) {
                throw new ShortageFundsException("Недостаточно средств на счете.");
            }
            balance -= amount;
        } finally {
            lock.unlock();
        }
    }

    /**
     * метод getBalance возвращает текущий баланс счета.
     *
     * @return текущий баланс счета
     */
    public double getBalance() {
        return balance;
    }
}