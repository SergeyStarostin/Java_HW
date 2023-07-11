package Controllers;

import Domen.Person;

/**
 * Интерфейс iUserController для управления пользователями.
 * 
 * @param <T> тип пользователя.
 */
public interface iUserController<T extends Person> {
    /**
     * Создает нового пользователя.
     * 
     * @param firstName  имя пользователя.
     * @param secondName фамилия пользователя.
     * @param age        возраст пользователя.
     * @param address    адрес пользователя.
     */
    void create(String firstName, String secondName, int age, String address);
}