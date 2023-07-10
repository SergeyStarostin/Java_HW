package Classes;

import java.util.List;
import java.util.ArrayList;
import java.io.FileWriter;
import java.io.IOException;
import Interfaces.iActorBehaviour;
import Interfaces.iMarketBehaviour;
import Interfaces.iQueueBehaviour;

public class Market implements iMarketBehaviour, iQueueBehaviour {

    /**
     * Файл для записи лога работы магазина
     */
    private FileWriter logFile;

    /**
     * Очередь клиентов
     */
    private List<iActorBehaviour> queue;

    /**
     * Максимально допустимое количество клиентов акции
     */
    private int maxPromotionalClientCount;

    /**
     * Текущее количество клиентов акции
     */
    private int promotionalClientCount;

    private List<Actor> successfulPurchaseActors; // Список успешно купивших товар клиентов

    /**
     * Конструктор класса Market.
     * Инициализирует список очереди, и создает файл для записи лога работы
     * магазина.
     */
    public Market() {
        this.queue = new ArrayList<>();
        this.maxPromotionalClientCount = 5;
        this.promotionalClientCount = 0;
        new ArrayList<>();
        this.successfulPurchaseActors = new ArrayList<>();

        // Создание файла для записи лога работы магазина
        try {
            logFile = new FileWriter("logStore.txt");
        } catch (IOException e) {
            System.out.println("Ошибка создания файла лога работы магазина: " + e.getMessage());
        }
    }

    /**
     * Метод для добавления клиента в магазин.
     *
     * @param actor Клиент, реализующий интерфейс iActorBehaviour.
     */
    @Override
    public void acceptToMarket(iActorBehaviour actor) {
        System.out.println(actor.getActor().getName() + " (клиент пришел в магазин)");
        if (actor instanceof PromotionalClient) {
            if (promotionalClientCount >= maxPromotionalClientCount) {
                System.out.println("Акционному клиенту " + actor.getActor().getName() +
                        " отказано в обслуживании из-за превышения количества участников акции)");
                return;
            } else
                promotionalClientCount++;
        }
        takeInQueue(actor);
    }

    /**
     * Метод для добавления клиента в очередь.
     *
     * @param actor Клиент, реализующий интерфейс iActorBehaviour.
     */
    @Override
    public void takeInQueue(iActorBehaviour actor) {
        this.queue.add(actor);
        System.out.println(actor.getActor().getName() + " (клиент добавлен в очередь)");
    }

    /**
     * Метод для обновления состояния магазина.
     * Вызывает методы takeOrder(), giveOrder() и releaseFromQueue().
     */
    @Override
    public void update() {
        takeOrder();
        giveOrder();
        releaseFromQueue();
    }

    /**
     * Метод для принятия заказа от клиента.
     */
    @Override
    public void takeOrder() {
        for (iActorBehaviour actor : queue) {
            if (!actor.isMakeOrder()) {
                actor.setMakeOrder(true);
                System.out.println(actor.getActor().getName() + " (у клиента приняли заказ)");
                try {
                    logFile.write(actor.getActor().getName() + " (клиент сделал заказ товара)\n");
                    logFile.flush();
                } catch (IOException e) {
                    System.out.println("Ошибка записи в файл лога работы магазина: " + e.getMessage());
                }
            }
        }
    }

    /**
     * Метод для выдачи заказа клиенту.
     */
    @Override
    public void giveOrder() {
        for (iActorBehaviour actor : queue) {
            if (actor.isMakeOrder()) {
                actor.setTakeOrder(true);
                System.out.println(actor.getActor().getName() + " (клиенту передали заказ)");
            }
        }
    }

    @Override
    public void releaseFromQueue() {
        List<Actor> releaseActors = new ArrayList<>();
        for (iActorBehaviour actor : queue) {
            if (actor.isTakeOrder()) {
                releaseActors.add(actor.getActor());
                System.out.println(actor.getActor().getName() + " (клиент вышел из очереди)");
            }
        }
        releaseFromMarket(releaseActors);
    }

    /**
     * Метод для освобождения клиентов из магазина.
     *
     * @param actors Список клиентов, которых необходимо освободить.
     */
    @Override
    public void releaseFromMarket(List<Actor> actors) {
        for (Actor actor : actors) {
            System.out.println(actor.getName() + " (клиент вышел из магазина)");
            queue.remove(actor);
            successfulPurchaseActors.add(actor);
            try {
                logFile.write(actor.getName() + " (успешно приобрел товар)\n");
                logFile.flush();
            } catch (IOException e) {
                System.out.println("Ошибка при записи в файл лога работы магазина: " + e.getMessage());
            }
        }
    }

    /**
     * Метод для закрытия файла лога.
     * Закрывает файл, используемый для записи лога работы магазина.
     */
    public void closeLogFile() {
        try {
            logFile.close();
        } catch (IOException e) {
            System.out.println("Ошибка при закрытии файла лога работы магазина: " + e.getMessage());
        }
    }
}