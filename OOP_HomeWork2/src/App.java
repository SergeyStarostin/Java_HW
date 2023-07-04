import Classes.*;
import Interfaces.iActorBehaviour;

public class App {
    public static void main(String[] args) throws Exception {

        // Создание экземпляра магазина
        Market magnit = new Market();

        // Создание клиентов магазина
        iActorBehaviour client1 = new OrdinaryClient("Сергей");
        iActorBehaviour client2 = new SpecialClient("Владимир", 1001);
        iActorBehaviour retiree1 = new RetireeClient("Петр Сергеевич", 1111);
        iActorBehaviour prom1 = new PromotionalClient("Максим", "discount 2 %", 1);
        iActorBehaviour prom2 = new PromotionalClient("Евгений", "discount 10 %", 2);
        iActorBehaviour prom3 = new PromotionalClient("Ольга", "discount 5 %", 3);
        iActorBehaviour prom4 = new PromotionalClient("Ирина", "discount 30 %", 4);
        iActorBehaviour prom5 = new PromotionalClient("Матвей", "discount 25 %", 5);
        iActorBehaviour prom6 = new PromotionalClient("Роджер", "discount 99 %", 6);
        iActorBehaviour prom7 = new PromotionalClient("Илья", "discount 50 %", 7);

        // Клиенты заходят в магазин
        magnit.acceptToMarket(client1);
        magnit.acceptToMarket(client2);
        magnit.acceptToMarket(retiree1);
        magnit.acceptToMarket(prom1);
        magnit.acceptToMarket(prom2);
        magnit.acceptToMarket(prom3);
        magnit.acceptToMarket(prom4);
        magnit.acceptToMarket(prom5);
        magnit.acceptToMarket(prom6);
        magnit.acceptToMarket(prom7);
        magnit.update();
    }
}