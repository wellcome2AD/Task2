package com.company;

public class BasedClock {
    private float price;
    private String brand;
    BasedClock(float _price, String _brand) {
        price = _price;
        brand = _brand;
    }

    public float GetPrice() {
        return price;
    }

    public String GetBrand() {
        return brand;
    }

}
