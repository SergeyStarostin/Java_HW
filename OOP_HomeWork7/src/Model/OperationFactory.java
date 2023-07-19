package Model;

import Actions.Addition;
import Actions.Difference;
import Actions.Division;
import Actions.Multiplication;
import Controller.iOperation;

/**
 * Фабрика операций.
 */
public class OperationFactory {

    /**
     * Создает объект операции в зависимости от переданного типа.
     * 
     * @param type тип операции
     * @return объект операции
     * @throws IllegalArgumentException если передан неизвестный тип операции
     */
    public static iOperation createOperation(String type) {
        switch (type) {
            case "сложение":
                return (iOperation) new Addition();
            case "вычитание":
                return (iOperation) new Difference();
            case "умножение":
                return (iOperation) new Multiplication();
            case "деление":
                return (iOperation) new Division();
            default:
                throw new IllegalArgumentException("Неизвестный тип операции: " + type);
        }
    }
}