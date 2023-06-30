package LaptopStore;

import java.util.Objects;

/*
Базовое задание:
Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. 
Реализовать в java. Создать множество ноутбуков. Переопределить toString, equals и hashCode.
Вывести на печать экземпляры класса, сравнить пару экземпляров и найти один экземпляр в наборе.
 */
public class LaptopConfiguration {
    private long id;
    private String model;
    private String color;
    private String cpu;
    private double frequency;
    private int ram;
    private int ssd;
    private String videoCard;
    private String os;

    // Геттеры
    public Long getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public String getCpu() {
        return cpu;
    }

    public Double getFrequency() {
        return frequency;
    }

    public int getRam() {
        return ram;
    }

    public int getSsd() {
        return ssd;
    }

    public String getVideoCard() {
        return videoCard;
    }

    public String getOs() {
        return os;
    }

    // Все вариации конструкторов
    public LaptopConfiguration(long id, String model, String color, String cpu,
            double frequency, int ram, int ssd, String videoCard, String os) {
        this.id = id;
        this.model = model;
        this.color = color;
        this.cpu = cpu;
        this.frequency = frequency;
        this.ram = ram;
        this.ssd = ssd;
        this.videoCard = videoCard;
        this.os = os;
    }

    @Override
    public String toString() {
        return "\n Ноутбук: " + "Id = " + id + "/" +
                " Модель: " + model + " /" +
                " Цвет: " + color + " /" +
                " Процессор: " + cpu + " /" +
                " Тактовая частота: " + frequency + " /" +
                " Оперативная память: " + ram + " /" +
                " Объем накопителя: " + ssd + " /" +
                " Видеокарта: " + videoCard + " /" +
                " Операционная система: " + os;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        LaptopConfiguration laptops = (LaptopConfiguration) o;
        return id == laptops.id &&
                model == laptops.model &&
                color == laptops.color &&
                cpu == laptops.cpu &&
                frequency == laptops.frequency &&
                ram == laptops.ram &&
                ssd == laptops.ssd &&
                videoCard == laptops.videoCard &&
                os == laptops.os;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, model, color, cpu, frequency, ram, ssd, videoCard, os);
    }
}