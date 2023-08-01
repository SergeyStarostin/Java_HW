package Bank.Exeptions;

/**
 * Исключение, возникающее если сумма перевода отрицательная или равна нулю.
 */
public class InvalidAmountException extends Exception {
    public InvalidAmountException(String message) {
        super(message);
    }
}