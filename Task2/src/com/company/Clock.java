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

public class Clock {
    int hour, min;
    float price;
    String brand;
    public Clock(float _price, String _brand) {
        hour = 0;
        min = 0;
        price = _price;
        brand = _brand;
    }
    public float GetPrice(){
        return price;
    }
    public String GetBrand(){
        return brand;
    }
    public void SetTime(int _hour, int _min) throws Exception {
        if (_hour < 0 || _hour > 23 || _min < 0 || _min > 59)
            throw new Exception("Wrong time!");
        hour = _hour;
        min = _min;
    }
    public void ChangeTime(int _hour, int _min) throws Exception {
        if (_hour < 0  || _min < 0)
            throw new Exception("You shall not change!");
        min += _min;
        hour = (hour + _hour + min / 60) % 24 ;
        min %= 60;
    }

    @Override
    public String toString()
    {
        return "время " + Integer.toString(hour) + "h:" + Integer.toString(min) + "m";
    }
/*
    public int GetHour(){
        return hour;
    }
    public int GetMin(){
        return min;
    }
*/
}
