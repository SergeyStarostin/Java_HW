package Interfaces;

/**
 * Поведение в очереди клиентов магазина.
 */
public interface iQueueBehaviour {

    /**
     * Метод добавления клиента в очередь.
     *
     * @param actor Клиент, который будет добавлен в очередь.
     */
    void takeInQueue(iActorBehaviour actor);

    /**
     * Метод выхода клиента из очереди.
     */
    void releaseFromQueue();

    /**
     * Метод для принятия заказа клиентом.
     */
    void takeOrder();

    /**
     * Метод для передачи заказа клиентом.
     */
    void giveOrder();
}