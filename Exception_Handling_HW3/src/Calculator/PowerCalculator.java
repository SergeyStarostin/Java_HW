package Calculator;

import Calculator.Exeptions.InvalidInputException;

/**
 * PowerCalculator - класс для вычисления степени числа.
 */
public class PowerCalculator {

    /**
     * PowerCalculator вычисляет значение степени для основания и показателя
     * степени, переданных в качестве аргументов.
     * Если введено некорректное основание (ноль) и отрицательная степень,
     * выбрасывается исключение InvalidInputException.
     *
     * @param base     - число, которое нужно возвести в степень
     * @param exponent - степень, в которую нужно возвести base
     * @return power - результат возведения в степень
     * @throws InvalidInputException выбрасывается, если введено некорректное
     *                               основание (ноль) и отрицательная степень.
     */
    public static double calculatePower(double base, double exponent)
            throws InvalidInputException {
        if (base == 0 && exponent < 0) {
            throw new InvalidInputException("Ошибка ввода: основание равно 0 и показатель степени отрицательный");
        }
        double power = Math.pow(base, exponent);
        return power;
    }
}