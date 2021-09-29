package com.company;

public class Clock2 extends Clock{
    private int hour, min, sec;
    private float price;
    private String brand;

    public Clock2(float _price, String _brand) {
        super(_price, _brand);
    }

    public void SetTime(int _hour, int _min, int _sec) throws Exception {
        if (_hour < 0 || _hour > 23 || _min < 0 || _min > 59 || _sec < 0 || _sec > 59)
            throw new Exception("Wrong time!");
        hour = _hour;
        min = _min;
        sec = _sec;
    }

    public void ChangeTime(int _hour, int _min, int _sec) throws Exception {
        if (_hour < 0  || _min < 0 || _sec < 0)
            throw new Exception("You shall not change!");
        sec += _sec;
        min += _min + sec % 60;
        hour = (hour + _hour + min / 60) % 24 ;
        min %= 60;
        sec %= 60;
    }
    @Override
    public String toString()
    {
        return "время " + Integer.toString(hour) + "h:" + Integer.toString(min) + "m:" + Integer.toString(sec) + 's';
    }
}
