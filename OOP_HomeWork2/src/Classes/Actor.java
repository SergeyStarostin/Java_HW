package Classes;

import Interfaces.iActorBehaviour;

/**
 * Абстрактный базовый класс для клиентов.
 */
public abstract class Actor implements iActorBehaviour {

    /**
     * Имя клиента.
     */
    protected String name;

    /**
     * Флаг, указывающий, может ли клиент принимать заказы.
     */
    protected boolean isTakeOrder;

    /**
     * Флаг, указывающий, может ли клиент осуществлять заказы.
     */
    protected boolean isMakeOrder;

    /**
     * Конструктор класса клиента.
     *
     * @param name Имя клиента.
     */
    public Actor(String name) {
        this.name = name;
    }

    /**
     * Абстрактный метод для получения имени клиента.
     *
     * @return Имя клиента.
     */
    abstract public String getName();
}