package com.course.services;

import com.course.entities.LibraryEntity;
import com.course.generics.CRUDServicesImpl;

import java.util.ArrayList;
import java.util.List;

public class LibraryServiceImpl extends CRUDServicesImpl<LibraryEntity> implements LibraryService {
    @Override
    public LibraryEntity getById(Integer id) {
        LibraryEntity libraryEntity = new LibraryEntity();
        libraryEntity.setId(1);
        libraryEntity.setAddress("7202, John Street");
        libraryEntity.setName("Drogheda Library");
        libraryEntity.setTelephoneNumber("55-555-5555");
        return libraryEntity;
    }

    @Override
    public List<LibraryEntity> getAll() {
        List<LibraryEntity> entityList = new ArrayList<LibraryEntity>();
        LibraryEntity libraryEntity = new LibraryEntity();
        libraryEntity.setId(1);
        libraryEntity.setAddress("7202, John Street");
        libraryEntity.setName("Drogheda Library");
        libraryEntity.setTelephoneNumber("55-555-5555");
        entityList.add(libraryEntity);
        return entityList;
    }
}
