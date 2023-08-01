package Bank.Exeptions;

/**
 * Исключение, возникающее если была попытка пополнить счет на сумму,
 * превышающую максимальный допустимый баланс, либо отрицательную сумму.
 */
public class MaxBalanceExceededException extends Exception {
    public MaxBalanceExceededException(String message) {
        super(message);
    }
}