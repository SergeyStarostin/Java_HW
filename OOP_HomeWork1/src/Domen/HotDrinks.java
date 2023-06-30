package Domen;

public class HotDrinks extends Product {
    // Поля объем и количество сахара
    private float hotDrinksVolume;
    private int hotDrinksQuantitySugar;

    // Свойства
    public float getHotDrinksVolume() {
        return hotDrinksVolume;
    }

    public int getHotDrinksQuantitySugar() {
        return hotDrinksQuantitySugar;
    }

    public void setHotDrinksVolume(float hotDrinksVolume) {
        this.hotDrinksVolume = hotDrinksVolume;
    }

    public void setHotDrinksQuantitySugar(int hotDrinksQuantitySugar) {
        this.hotDrinksQuantitySugar = hotDrinksQuantitySugar;
    }

    //конструкторы
    public  HotDrinks(int price, int place, String name, long id){
        super(price, place, name, id);
        this.hotDrinksVolume = 0f;
        this.hotDrinksQuantitySugar = (int) 0f;
    }
    public HotDrinks (int price, int place, String name, long id, float hotDrinksVolume, int hotDrinksQuantitySugar){
        super(price, place, name, id);
        this.hotDrinksVolume = hotDrinksVolume;
        this.hotDrinksQuantitySugar = hotDrinksQuantitySugar;
    }

    @Override
    public String toString() {
        return super.toString() + "Volume = " + hotDrinksVolume + " l.\n" +
        "Sugar = " + hotDrinksQuantitySugar + " g.\n";
    }
}