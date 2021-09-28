package com.company;

public class Main {

    public static void main(String[] args) {
        Clock clock = new Clock(100.10f, "часы надёжнее швейцарских");
        String brand = clock.GetBrand();
        float price = clock.GetPrice();
        System.out.println("марка: " + brand + "    цена: " + price);
        try {
            clock.SetTime(14, 45);
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            clock.ChangeTime(12, 30);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(clock);
    }
}
