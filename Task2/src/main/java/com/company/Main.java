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
        ClockFactory clockFactory = new ClockFactory();

        SoManyClocks clock1 = clockFactory.createClock(TypeOfClock.ClockWithSecondArrow);
        SoManyClocks clock2 = clockFactory.createClock(TypeOfClock.ClockWithMinuteArrow);

        System.out.println("марка " + clock1.GetBrand() + "    цена " + clock1.GetPrice());

        try {
            clock1.SetTime();
        } catch (MyExceptions ex) {
            ex.printStackTrace();
        }
        System.out.println(clock1);

        try {
            clock1.ChangeTime();
        } catch (MyExceptions ex) {
            ex.printStackTrace();
        }
        System.out.println(clock1);

        System.out.println("\nмарка " + clock2.GetBrand() + "    цена " + clock2.GetPrice());

       try {
            clock2.SetTime();
        } catch (MyExceptions ex) {
           ex.printStackTrace();
       }
        System.out.println(clock2);

        try {
            clock2.ChangeTime();
        } catch (MyExceptions ex) {
            ex.printStackTrace();
        }
        System.out.println(clock2);
    }
}
