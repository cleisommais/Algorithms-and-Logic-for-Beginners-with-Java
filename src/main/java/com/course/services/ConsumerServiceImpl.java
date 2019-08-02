package com.course.services;

import com.course.entities.ConsumerEntity;
import com.course.enums.Genre;
import com.course.generics.CRUDServicesImpl;

import java.util.ArrayList;
import java.util.List;


/**
 * ConsumerService is the service responsible to create/update/delete/retrieve ConsumerEntity from database
 *
 * @author cleison.melo
 * @version 1.0
 */

public class ConsumerServiceImpl extends CRUDServicesImpl<ConsumerEntity> implements ConsumerService {

    @Override
    public List<ConsumerEntity> getAll() {
        List<ConsumerEntity> consumerEntityList = new ArrayList<ConsumerEntity>();
        ConsumerEntity consumerEntity = new ConsumerEntity();
        consumerEntity.setId(1);
        consumerEntity.setAge(37);
        consumerEntity.setFirstName("Cleison");
        consumerEntity.setLastName("Melo");
        consumerEntity.setTelephoneNumber("55-5555-5555");
        consumerEntity.setGenre(Genre.MALE);
        consumerEntityList.add(consumerEntity);
        return consumerEntityList;
    }

    @Override
    public ConsumerEntity getById(Integer id) {
        ConsumerEntity consumerEntity = new ConsumerEntity();
        consumerEntity.setId(id);
        consumerEntity.setAge(37);
        consumerEntity.setFirstName("Cleison");
        consumerEntity.setLastName("Melo");
        consumerEntity.setGenre(Genre.MALE);
        consumerEntity.setTelephoneNumber("55-5555-5555");
        return consumerEntity;
    }
}
