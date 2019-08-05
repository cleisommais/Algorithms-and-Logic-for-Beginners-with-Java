package com.course.services;

import com.course.entities.BookEntity;
import com.course.enums.BookTypes;
import com.course.generics.CRUDServicesImpl;

import java.util.ArrayList;
import java.util.List;

public class BookServiceImpl extends CRUDServicesImpl<BookEntity> implements BookService {
    @Override
    public BookEntity getById(Integer id) {
        BookEntity bookEntity = new BookEntity();
        bookEntity.setId(1);
        bookEntity.setAuthor("Cleison Melo");
        bookEntity.setName("Algorithms and Logic");
        bookEntity.setPrice(0.0);
        bookEntity.setType(BookTypes.TEXT_BOOK);
        return bookEntity;
    }

    @Override
    public List<BookEntity> getAll() {
        BookEntity bookEntity = new BookEntity();
        bookEntity.setId(1);
        bookEntity.setAuthor("Cleison Melo");
        bookEntity.setName("Algorithms and Logic");
        bookEntity.setPrice(0.0);
        bookEntity.setType(BookTypes.TEXT_BOOK);
        List<BookEntity> entityList = new ArrayList<BookEntity>();
        entityList.add(bookEntity);
        return entityList;
    }
}
