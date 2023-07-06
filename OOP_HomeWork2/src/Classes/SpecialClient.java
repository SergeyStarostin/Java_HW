package Classes;

public class SpecialClient extends Actor {
    public SpecialClient(String name, Integer id) {
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

    @Override
    public void setTakeOrder(boolean takeOrder) {
        super.isTakeOrder = takeOrder;
    }

    @Override
    public void setMakeOrder(boolean makeOrder) {
        super.isMakeOrder = makeOrder;
    }

    @Override
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