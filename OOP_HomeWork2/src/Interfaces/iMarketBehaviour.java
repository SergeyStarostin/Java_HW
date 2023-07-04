package Interfaces;

import Classes.Actor;
import java.util.List;

/**
 * Интерфейс, определяющий поведение клиентов магазина.
 */
public interface iMarketBehaviour {
    /**
     * Метод для входа клиента в магазин.
     *
     * @param actor Клиент, который будет принят в магазин.
     */
    void acceptToMarket(iActorBehaviour actor);

    /**
     * Метод для ухода клиентов из магазина.
     *
     * @param actor Список клиентов, которые уйдут из магазина.
     */
    void releaseFromMarket(List<Actor> actor);

    /**
     * Метод для обновления состояния магазина.
     */
    void update();
}