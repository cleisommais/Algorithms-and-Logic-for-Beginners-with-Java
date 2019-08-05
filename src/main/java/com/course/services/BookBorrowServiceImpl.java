package com.course.services;

import com.course.entities.BookBorrowEntity;
import com.course.entities.BookEntity;
import com.course.entities.ConsumerEntity;
import com.course.entities.LibraryEntity;
import com.course.enums.BookTypes;
import com.course.enums.Genre;
import com.course.generics.CRUDServicesImpl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BookBorrowServiceImpl extends CRUDServicesImpl<BookBorrowEntity> implements BookBorrowService {
    @Override
    public BookBorrowEntity getById(Integer id) {
        return bookBorrowEntityMock();
    }

    @Override
    public List<BookBorrowEntity> getAll() {
        List<BookBorrowEntity> entityList = new ArrayList<BookBorrowEntity>();
        entityList.add(bookBorrowEntityMock());
        return entityList;
    }

    private BookBorrowEntity bookBorrowEntityMock() {
        BookBorrowEntity bookBorrowEntity = new BookBorrowEntity();
        LibraryEntity libraryEntity = new LibraryEntity();
        libraryEntity.setId(1);
        libraryEntity.setAddress("7202, John Street");
        libraryEntity.setName("Drogheda Library");
        libraryEntity.setTelephoneNumber("55-555-5555");
        ConsumerEntity consumerEntity = new ConsumerEntity();
        consumerEntity.setFirstName("Cleison");
        consumerEntity.setLastName("Melo");
        consumerEntity.setGenre(Genre.MALE);
        consumerEntity.setAge(37);
        consumerEntity.setTelephoneNumber("55-5555-5555");
        BookEntity bookEntity = new BookEntity();
        bookEntity.setId(1);
        bookEntity.setAuthor("Cleison Melo");
        bookEntity.setName("Algorithms and Logic");
        bookEntity.setPrice(0.0);
        bookEntity.setType(BookTypes.TEXT_BOOK);
        bookBorrowEntity.setId(1);
        bookBorrowEntity.setDateBorrow(new Date());
        bookBorrowEntity.setBookEntity(bookEntity);
        bookBorrowEntity.setConsumerEntity(consumerEntity);
        bookBorrowEntity.setLibraryEntity(libraryEntity);
        return bookBorrowEntity;
    }
}
