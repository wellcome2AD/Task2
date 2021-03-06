package com.company;

import java.util.Scanner;

public class Clock2 extends BasedClock implements SoManyClocks {
    private int hour = 0, min = 0, sec = 0;
    private final Scanner in = new Scanner(System.in);

    public Clock2(float _price, String _brand) {
        super(_price, _brand);
    }

    public void SetTime() throws MyExceptions {
        System.out.print("Начальное время (h, m, s): ");
        int _hour = in.nextInt();
        int _min = in.nextInt();
        int _sec = in.nextInt();

        if (_hour < 0 || _hour > 23)
            throw new MyExceptions("Wrong hours!", _hour);
        else if (_min < 0 || _min > 59)
            throw new MyExceptions("Wrong minutes!", _min);
        else if (_sec < 0 || _sec > 59)
            throw new MyExceptions("Wrong seconds!", _sec);

        hour = _hour;
        min = _min;
        sec = _sec;
    }

    public void ChangeTime() throws MyExceptions {
        System.out.print("Перевод времени на ");
        int _hour = in.nextInt();
        int _min = in.nextInt();
        int _sec = in.nextInt();

        if (_hour < 0)
            throw new MyExceptions("Wrong hours!", _hour);
        else if (_min < 0)
            throw new MyExceptions("Wrong minutes!", _min);
        else if (_sec < 0)
            throw new MyExceptions("Wrong seconds!", _sec);

        sec += _sec;
        min += _min + sec / 60;
        sec %= 60;
        hour = (hour + _hour + min / 60) % 24 ;
        min %= 60;
    }
    @Override
    public String toString()
    {
        return "время " + hour + "h:" + min + "m:" + sec + 's';
    }
}
