package com.course.entities;

import com.course.enums.BookTypes;

/**
 * @author cleison.melo
 * @version 1.0
 */
public class BookEntity {
    private Integer id;
    private String name;
    private String author;
    private BookTypes type;
    private Double price;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public BookTypes getType() {
        return type;
    }

    public void setType(BookTypes type) {
        this.type = type;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
