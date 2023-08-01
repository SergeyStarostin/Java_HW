package Bank.Exeptions;

/**
 * Исключение, возникающее если на балансе недостаточно средств для перевода.
 */
public class ShortageFundsException extends Exception {
    public ShortageFundsException(String message) {
        super(message);
    }
}