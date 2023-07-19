package Actions;

import Controller.iOperation;
import Model.ComplexNumber;

/**
 * Класс для выполнения операции сложения комплексных чисел
 */
public class Difference implements iOperation {
    /**
     * Метод для выполнения операции разности двух комплексных чисел
     * 
     * @param a первое комплексное число
     * @param b второе комплексное число
     * @return результат вычитания двух комплексных чисел
     */
    public ComplexNumber execute(ComplexNumber a, ComplexNumber b) {
        return new ComplexNumber(a.getReal() - b.getReal(), a.getImaginary() - b.getImaginary());
    }
}