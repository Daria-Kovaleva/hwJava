import java.util.Objects;

public class Laptop {

    private String name;
    private int ram;
    private int capacityHD;
    private String os;
    private double diagonal;
    private String color;
    
    public Laptop(String name, int ram, int capacityHD, String os, double diagonal, String color) {
        this.name = name;
        this.ram = ram;
        this.capacityHD = capacityHD;
        this.os = os;
        this.diagonal = diagonal;
        this.color = color;
    }

    public String getname() {
        return name;
    }

    public int getRam() {
        return ram;
    }

    public int getCapacityHD() {
        return capacityHD;
    }

    public String getOs() {
        return os;
    }

    public double getDiagonal() {
        return diagonal;
    }

    public String gerColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Модель: " + name + ", " + "ОЗУ: " + ram + ", " + "Объём жёсткого диска: " + capacityHD + ", " + "Операционная система: " + os + ", " + "Диагональ: " + diagonal + ", " + "Цвет: " +color; 
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) {
            return true;
        }
        if(o == null || getClass() != o.getClass()) {
            return false;
        }
        Laptop laptop = (Laptop)o;

        return Objects.equals(ram, laptop.ram) && Objects.equals(capacityHD, laptop.capacityHD);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ram, capacityHD, diagonal);
    }
}