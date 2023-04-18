package com.kbstar.dto;

public class ProductDTO {
    private String name;
    private int price;
    private int qty;

    public ProductDTO() {
    }

    public ProductDTO(String name, int price, int qty) {
        this.name = name;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", qty=" + qty +
                '}';
    }


}




