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

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int hour, min, sec;

        Scanner in = new Scanner(System.in);

        Clock clock1 = new Clock(100.10f, "часы надёжнее швейцарских");

        System.out.println("часы I типа");

        System.out.println("марка: " + clock1.GetBrand() + "    цена: " + clock1.GetPrice());

        System.out.println("Начальное время");
        System.out.print("Введите часы: ");
        hour = in.nextInt();
        System.out.print("Введите минуты: ");
        min = in.nextInt();

        try {
            clock1.SetTime(hour, min);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(clock1);

        System.out.println("Перевод времени");
        System.out.print("На сколько часов вперёд: ");
        hour = in.nextInt();
        System.out.print("На сколько минут вперёд: ");
        min = in.nextInt();

        try {
            clock1.ChangeTime(hour, min);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(clock1);

        Clock2 clock2 = new Clock2(200.34f, "часы сына маминой подруги");

        System.out.println("часы II типа");

        System.out.println("марка: " + clock2.GetBrand() + "    цена: " + clock2.GetPrice());

        System.out.println("Начальное время");
        System.out.print("Введите часы: ");
        hour = in.nextInt();
        System.out.print("Введите минуты: ");
        min = in.nextInt();
        System.out.print("Введите секунды: ");
        sec = in.nextInt();

        try {
            clock2.SetTime(hour, min, sec);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(clock2);

        System.out.println("Перевод времени");
        System.out.print("На сколько часов вперёд: ");
        hour = in.nextInt();
        System.out.print("На сколько минут вперёд: ");
        min = in.nextInt();
        System.out.print("На сколько секунд вперёд: ");
        sec = in.nextInt();

        try {
            clock2.ChangeTime(hour, min, sec);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(clock2);
    }
}
