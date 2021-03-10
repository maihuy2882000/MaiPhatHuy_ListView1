package com.example.lession;

public class Tshirts {
    private String Name;
    private String Price;
    private  int imgTshirts;

    public Tshirts(String name,String price, int imgtshirts) {
        Name = name;
        Price = price;
        imgTshirts = imgtshirts;
    }

    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String price) {
        Price = price;
    }

    public int getImgTshirts() {
        return imgTshirts;
    }

    public void setImgTshirts(int imgTshirts) {
        this.imgTshirts = imgTshirts;
    }
}
