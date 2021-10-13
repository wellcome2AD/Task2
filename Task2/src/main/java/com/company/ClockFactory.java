package com.company;

public class ClockFactory {
    public SoManyClocks createClock(int type){
        SoManyClocks clock = null;
        switch (type) {
            case 1:
                clock = new Clock(100.10f, "часы надёжнее швейцарских");
                break;
            case 2:
                clock = new Clock2(200.34f, "часы сына маминой подруги");
                break;
        }
        return clock;
    }

}
