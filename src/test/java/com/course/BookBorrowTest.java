package com.course;


import com.course.entities.BookBorrowEntity;
import com.course.entities.BookEntity;
import com.course.entities.ConsumerEntity;
import com.course.entities.LibraryEntity;
import com.course.enums.BookTypes;
import com.course.enums.Genre;
import com.course.services.BookBorrowService;
import com.course.services.BookBorrowServiceImpl;
import org.junit.Assert;
import org.junit.Test;

import java.util.Date;
import java.util.List;

/**
 * BookBorrowTest is the test responsible to test the actions to create/update/delete/retrieve BookBorrowEntity
 *
 * @author cleison.melo
 * @version 1.0
 */
public class BookBorrowTest {
    @Test
    public void createBookTest() {
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
        BookBorrowService bookBorrowService = new BookBorrowServiceImpl();
        Assert.assertEquals(bookBorrowEntity.getId(), bookBorrowService.create(bookBorrowEntity).getId());
    }

    @Test
    public void updateBookTest() {
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
        BookBorrowService bookBorrowService = new BookBorrowServiceImpl();
        Assert.assertEquals(true, bookBorrowService.update(bookBorrowEntity, bookBorrowEntity.getId()));
    }

    @Test
    public void deleteBookTest() {
        BookBorrowEntity bookBorrowEntity = new BookBorrowEntity();
        bookBorrowEntity.setId(1);
        BookBorrowService bookBorrowService = new BookBorrowServiceImpl();
        Assert.assertEquals(true, bookBorrowService.delete(bookBorrowEntity.getId()));
    }

    @Test
    public void getByIdBookTest() {
        BookBorrowEntity bookBorrowEntity = new BookBorrowEntity();
        bookBorrowEntity.setId(1);
        BookBorrowService bookBorrowService = new BookBorrowServiceImpl();
        Assert.assertEquals(bookBorrowEntity.getId(), bookBorrowService.getById(bookBorrowEntity.getId()).getId());
    }

    @Test
    public void getAllBookTest() {
        BookBorrowService bookBorrowService = new BookBorrowServiceImpl();
        List<BookBorrowEntity> entityList = bookBorrowService.getAll();
        Assert.assertEquals(1, entityList.size());
        Assert.assertEquals("Algorithms and Logic", entityList.get(0).getBookEntity().getName());
    }
}
