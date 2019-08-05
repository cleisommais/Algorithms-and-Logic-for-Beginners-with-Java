package com.course;

import com.course.entities.LibraryEntity;
import com.course.services.LibraryService;
import com.course.services.LibraryServiceImpl;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

/**
 * LibraryTest is the test responsible to test the actions to create/update/delete/retrieve LibraryEntity
 *
 * @author cleison.melo
 * @version 1.0
 */
public class LibraryTest {
    @Test
    public void createLibraryTest() {
        LibraryEntity libraryEntity = new LibraryEntity();
        libraryEntity.setId(1);
        libraryEntity.setAddress("7202, John Street");
        libraryEntity.setName("Drogheda Library");
        libraryEntity.setTelephoneNumber("55-555-5555");
        LibraryService libraryService = new LibraryServiceImpl();
        Assert.assertEquals(libraryEntity.getName(), libraryService.create(libraryEntity).getName());
    }

    @Test
    public void updateLibraryTest() {
        LibraryEntity libraryEntity = new LibraryEntity();
        libraryEntity.setId(1);
        libraryEntity.setAddress("7202, John Street");
        libraryEntity.setName("Drogheda Library");
        libraryEntity.setTelephoneNumber("55-555-5555");
        LibraryService libraryService = new LibraryServiceImpl();
        Assert.assertEquals(true, libraryService.update(libraryEntity, libraryEntity.getId()));
    }

    @Test
    public void deleteLibraryTest() {
        LibraryEntity libraryEntity = new LibraryEntity();
        libraryEntity.setId(1);
        LibraryService libraryService = new LibraryServiceImpl();
        Assert.assertEquals(true, libraryService.delete(libraryEntity.getId()));
    }

    @Test
    public void getByIdLibraryTest() {
        LibraryEntity libraryEntity = new LibraryEntity();
        libraryEntity.setTelephoneNumber("55-555-5555");
        LibraryService libraryService = new LibraryServiceImpl();
        Assert.assertEquals(libraryEntity.getTelephoneNumber(), libraryService.getById(libraryEntity.getId()).getTelephoneNumber());
    }

    @Test
    public void getAllLibraryTest() {
        LibraryService libraryService = new LibraryServiceImpl();
        List<LibraryEntity> entityList = libraryService.getAll();
        Assert.assertEquals(1, entityList.size());
        Assert.assertEquals("Drogheda Library", entityList.get(0).getName());
    }
}
