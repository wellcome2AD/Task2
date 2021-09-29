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

public class Clock implements SoManyClocks {
    private int hour, min;
    private final float price;
    private final String brand;
    private final Scanner in = new Scanner(System.in);

    public Clock(float _price, String _brand) {
        hour = 0;
        min = 0;
        price = _price;
        brand = _brand;
    }

    //@Override
    public float GetPrice() {
        return price;
    }

    public String GetBrand() {
        return brand;
    }

    public void SetTime() throws MyExceptions {
        int _hour, _min;
        System.out.print("Начальное время:");
        _hour = in.nextInt();
        _min = in.nextInt();
        if (_hour < 0 || _hour > 23)
            throw new MyExceptions("Wrong hours!");
        else if (_min < 0 || _min > 59)
            throw new MyExceptions("Wrong minutes!");
        hour = _hour;
        min = _min;
    }
    public void ChangeTime() throws MyExceptions {
        int _hour, _min;
        System.out.print("Перевод времени на ");
        _hour = in.nextInt();
        _min = in.nextInt();
        if (_hour < 0)
            throw new MyExceptions("Wrong hours!");
        else if (_min < 0)
            throw new MyExceptions("Wrong minutes!");
        min += _min;
        hour = (hour + _hour + min / 60) % 24 ;
        min %= 60;
    }

    @Override
    public String toString()
    {
        return "время " + hour + "h:" + min + "m";
    }
}
