package Classes;

public class OrdinaryClient extends Actor {
    public OrdinaryClient(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return super.name;
    }

    @Override
    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }

    @Override
    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }

    public void setTakeOrder(boolean takeOrder) {
        super.isTakeOrder = takeOrder;
    }

    public void setMakeOrder(boolean makeOrder) {
        super.isMakeOrder = makeOrder;
    }

    public Actor getActor() {
        return this;
    }

    @Override
    public void setMakeReturnOrder(boolean makeReturnOrder) {

        throw new UnsupportedOperationException("Unimplemented method 'setMakeReturnOrder'");
    }

    @Override
    public void setMakePaid(boolean makePaid) {

        throw new UnsupportedOperationException("Unimplemented method 'setMakePaid'");
    }

    @Override
    public boolean isMakeReturnOrder() {

        throw new UnsupportedOperationException("Unimplemented method 'isMakeReturnOrder'");
    }

    @Override
    public boolean isMakePaid() {

        throw new UnsupportedOperationException("Unimplemented method 'isMakePaid'");
    }
}