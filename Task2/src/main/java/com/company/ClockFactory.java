package com.company;

public class ClockFactory {
    public SoManyClocks createClock(TypeOfClock type){
        SoManyClocks clock = null;
        switch (type) {
            case ClockWithSecondArrow:
                clock = new Clock(100.10f, "часы надёжнее швейцарских");
                break;
            case ClockWithMinuteArrow:
                clock = new Clock2(200.34f, "часы сына маминой подруги");
                break;
        }
        return clock;
    }

}
