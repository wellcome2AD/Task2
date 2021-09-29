package com.company;

public interface SoManyClocks {
    float GetPrice();
    String GetBrand();
    void SetTime() throws MyExceptions;
    void ChangeTime() throws MyExceptions;
    String toString();
}
