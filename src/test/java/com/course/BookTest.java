package com.course;

import com.course.entities.BookEntity;
import com.course.enums.BookTypes;
import com.course.services.BookService;
import com.course.services.BookServiceImpl;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

/**
 * BookTest is the test responsible to test the actions to create/update/delete/retrieve BookEntity
 *
 * @author cleison.melo
 * @version 1.0
 */
public class BookTest {
    @Test
    public void createBookTest() {
        BookEntity bookEntity = new BookEntity();
        bookEntity.setId(1);
        bookEntity.setAuthor("Cleison Melo");
        bookEntity.setName("Algorithms and Logic");
        bookEntity.setPrice(0.0);
        bookEntity.setType(BookTypes.TEXT_BOOK);
        BookService bookService = new BookServiceImpl();
        Assert.assertEquals(bookEntity.getName(), bookService.create(bookEntity).getName());
    }

    @Test
    public void updateBookTest() {
        BookEntity bookEntity = new BookEntity();
        bookEntity.setId(1);
        bookEntity.setAuthor("Cleison Melo");
        bookEntity.setName("Algorithms and Logic");
        bookEntity.setPrice(0.0);
        bookEntity.setType(BookTypes.TEXT_BOOK);
        BookService bookService = new BookServiceImpl();
        Assert.assertEquals(true, bookService.update(bookEntity, bookEntity.getId()));
    }

    @Test
    public void deleteBookTest() {
        BookEntity bookEntity = new BookEntity();
        bookEntity.setId(1);
        BookService bookService = new BookServiceImpl();
        Assert.assertEquals(true, bookService.delete(bookEntity.getId()));
    }

    @Test
    public void getByIdBookTest() {
        BookEntity bookEntity = new BookEntity();
        bookEntity.setName("Algorithms and Logic");
        BookService bookService = new BookServiceImpl();
        Assert.assertEquals(bookEntity.getName(), bookService.getById(bookEntity.getId()).getName());
    }

    @Test
    public void getAllBookTest() {
        BookService bookService = new BookServiceImpl();
        List<BookEntity> entityList = bookService.getAll();
        Assert.assertEquals(1, entityList.size());
        Assert.assertEquals("Algorithms and Logic", entityList.get(0).getName());
    }
}
