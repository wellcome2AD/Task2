/*
Реализуйте класс часы:
    две стрелки – часовая и минутная
    название марки
    цена часов.
Класс часы должен позволять:
    получать стоимость часов
    получать название марки часов
    устанавливать начальное время
    переводить время вперед.
*/
package com.company;

public class Main {

    public static void main(String[] args) {

        SoManyClocks clock1 = new Clock(100.10f, "часы надёжнее швейцарских");

        System.out.println("часы I типа");

        System.out.println("марка: " + clock1.GetBrand() + "    цена: " + clock1.GetPrice());

        try {
            clock1.SetTime();
        } catch (MyExceptions ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println(clock1);

        try {
            clock1.ChangeTime();
        } catch (MyExceptions ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println(clock1);

        SoManyClocks clock2 = new Clock2(200.34f, "часы сына маминой подруги");

        System.out.println("часы II типа");

        System.out.println("марка: " + clock2.GetBrand() + "    цена: " + clock2.GetPrice());

       try {
            clock2.SetTime();
        } catch (MyExceptions ex) {
           System.out.println(ex.getMessage());
       }
        System.out.println(clock2);

        try {
            clock2.ChangeTime();
        } catch (MyExceptions ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println(clock2);
    }
}
