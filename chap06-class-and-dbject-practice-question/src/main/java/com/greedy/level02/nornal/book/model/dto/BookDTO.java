package com.greedy.level02.nornal.book.model.dto;

public class BookDTO {

    private String title;

    private String publisher;

    private String author;

    private int price;

    private double discount;

    public BookDTO(){

    }

    public BookDTO(String title, String publisher, String author) {
        this.title = title;
        this.publisher = publisher;
        this.author = author;

    }

    public BookDTO(String title, String publisher, String author, int price, double discount) {
        this.title = title;
        this.publisher = publisher;
        this.author = author;
        this.price = price;
        this.discount = discount;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public String getTitle() {
        return title;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getAuthor() {
        return author;
    }

    public int getPrice() {
        return price;
    }

    public double getDiscount() {
        return discount;
    }

    public  String getInformation(){
        return "title = " + this.title +
                ", publisher = " + this.publisher +
                ", author = " + this.author +
                ", price = " + this.price +
                ", discount = " + this.discount;




    }


}
