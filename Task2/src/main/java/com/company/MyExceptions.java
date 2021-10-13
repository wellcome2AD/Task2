package com.company;

public class MyExceptions extends Exception {
    private int i =0;
    public MyExceptions(String message, int _i) {
        super(message);
        i = _i;
    }
    @Override
    public String toString() {
        return this.getMessage() + i;
    }
}