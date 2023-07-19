package Actions;

import Controller.iOperation;
import Model.ComplexNumber;

/**
 * Класс для выполнения операции сложения комплексных чисел
 */
public class Addition implements iOperation {
    /**
     * Метод для выполнения операции сложения двух комплексных чисел
     * 
     * @param a первое комплексное число
     * @param b второе комплексное число
     * @return результат сложения двух комплексных чисел
     */
    public ComplexNumber execute(ComplexNumber a, ComplexNumber b) {
        return new ComplexNumber(a.getReal() + b.getReal(), a.getImaginary() + b.getImaginary());
    }
}