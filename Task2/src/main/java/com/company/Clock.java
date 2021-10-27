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

public class Clock extends BasedClock implements SoManyClocks {
    private int hour = 0, min = 0;
    private final Scanner in = new Scanner(System.in);

    public Clock(float _price, String _brand) {
        super(_price, _brand);
    }

    public void SetTime() throws MyExceptions {
        int _hour, _min;
        System.out.print("Начальное время (h, m): ");
        _hour = in.nextInt();
        _min = in.nextInt();
        if (_hour < 0 || _hour > 23)
            throw new MyExceptions("Wrong hours! ", _hour);
        else if (_min < 0 || _min > 59)
            throw new MyExceptions("Wrong minutes! ", _min);
        hour = _hour;
        min = _min;
    }
    public void ChangeTime() throws MyExceptions {
        int _hour, _min;
        System.out.print("Перевод времени на ");
        _hour = in.nextInt();
        _min = in.nextInt();
        if (_hour < 0)
            throw new MyExceptions("Wrong hours! ", _hour);
        else if (_min < 0)
            throw new MyExceptions("Wrong minutes! ", _min);
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
