package Atestation;

import java.util.Objects;

public class Noutbuck {
    private String brand;
    private String model;
    private int ram;
    private int hdd;
    private double diagonal;
    private String color;
    private String video_card;
    private String operating_system;

    public Noutbuck(String brand, String model, int ram, int hdd, double diagonal, String color, String video_card,
            String operating_system) {
        this.brand = brand;
        this.model = model;
        this.ram = ram;
        this.hdd = hdd;
        this.diagonal = diagonal;
        this.color = color;
        this.video_card = video_card;
        this.operating_system = operating_system;

    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getRam() {
        return ram;
    }

    public int getHdd() {
        return hdd;
    }

    public double getDiagonal() {
        return diagonal;
    }

    public String getColor() {
        return color;
    }

    public String getVideo_card() {
        return video_card;
    }

    public String getOperating_system() {
        return operating_system;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void setHdd(int hdd) {
        this.hdd = hdd;
    }

    public void setDiagonal(double diagonal) {
        this.diagonal = diagonal;
    }

    public void setOperating_system(String operating_system) {
        this.operating_system = operating_system;
    }

    public void setVideo_card(String video_card) {
        this.video_card = video_card;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Бренд: " + brand + "\n"
                + "Модель: " + model + "\n"
                + "Оперативная память: " + ram + "\n"
                + "Жесткий диск: " + hdd + "\n"
                + "Диагональ: " + diagonal + "\n"
                + "Цвет: " + color + "\n"
                + "Видео карта: " + video_card + "\n"
                + "Операционная система: " + operating_system;

    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Noutbuck noutbuck = (Noutbuck) obj;
        return brand.equals(noutbuck.brand)
                && model.equals(noutbuck.model)
                && ram == noutbuck.ram
                && hdd == noutbuck.hdd
                && diagonal == noutbuck.diagonal
                && video_card.equals(noutbuck.video_card)
                && operating_system.equals(noutbuck.operating_system)
                && color.equals(noutbuck.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, ram, hdd, diagonal, color, video_card, operating_system);
    }
}