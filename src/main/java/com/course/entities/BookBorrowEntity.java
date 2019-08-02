package com.course.entities;

import java.util.Date;

public class BookBorrowEntity {
    private Integer id;
    private Date dateBorrow;
    private ConsumerEntity consumerEntity;
    private BookEntity bookEntity;
    private LibraryEntity libraryEntity;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDateBorrow() {
        return dateBorrow;
    }

    public void setDateBorrow(Date dateBorrow) {
        this.dateBorrow = dateBorrow;
    }

    public ConsumerEntity getConsumerEntity() {
        return consumerEntity;
    }

    public void setConsumerEntity(ConsumerEntity consumerEntity) {
        this.consumerEntity = consumerEntity;
    }

    public BookEntity getBookEntity() {
        return bookEntity;
    }

    public void setBookEntity(BookEntity bookEntity) {
        this.bookEntity = bookEntity;
    }

    public LibraryEntity getLibraryEntity() {
        return libraryEntity;
    }

    public void setLibraryEntity(LibraryEntity libraryEntity) {
        this.libraryEntity = libraryEntity;
    }
}
