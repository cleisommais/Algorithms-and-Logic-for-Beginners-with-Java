package com.course;

import com.course.entities.ConsumerEntity;
import com.course.enums.Genre;
import com.course.services.ConsumerService;
import com.course.services.ConsumerServiceImpl;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

/**
 * ConsumerTest is the test responsible to test the actions to create/update/delete/retrieve ConsumerEntity
 *
 * @author cleison.melo
 * @version 1.0
 */

public class ConsumerTest {

    @Test
    public void createConsumerTest() {
        ConsumerEntity consumerEntity = new ConsumerEntity();
        consumerEntity.setFirstName("Cleison");
        consumerEntity.setLastName("Melo");
        consumerEntity.setGenre(Genre.MALE);
        consumerEntity.setAge(37);
        consumerEntity.setTelephoneNumber("55-5555-5555");
        ConsumerService service = new ConsumerServiceImpl();
        Assert.assertEquals(consumerEntity.getFirstName(), service.create(consumerEntity).getFirstName());
    }

    @Test
    public void updateConsumerTest() {
        ConsumerEntity consumerEntity = new ConsumerEntity();
        consumerEntity.setId(1);
        consumerEntity.setFirstName("Cleison");
        consumerEntity.setLastName("Melo");
        consumerEntity.setGenre(Genre.MALE);
        consumerEntity.setAge(37);
        consumerEntity.setTelephoneNumber("55-5555-5555");
        ConsumerService service = new ConsumerServiceImpl();
        Assert.assertEquals(true, service.update(consumerEntity, consumerEntity.getId()));
    }

    @Test
    public void deleteConsumerTest() {
        ConsumerEntity consumerEntity = new ConsumerEntity();
        consumerEntity.setId(1);
        ConsumerService service = new ConsumerServiceImpl();
        Assert.assertEquals(true, service.delete(consumerEntity.getId()));
    }

    @Test
    public void getByIdConsumerTest() {
        ConsumerEntity consumerEntity = new ConsumerEntity();
        consumerEntity.setId(1);
        ConsumerService service = new ConsumerServiceImpl();
        Assert.assertEquals("55-5555-5555", service.getById(consumerEntity.getId()).getTelephoneNumber());
    }

    @Test
    public void getAllConsumerTest() {
        ConsumerService consumerService = new ConsumerServiceImpl();
        List<ConsumerEntity> consumerList = consumerService.getAll();
        Assert.assertEquals(1, consumerList.size());
        Assert.assertEquals("Melo", consumerList.get(0).getLastName());
    }
}
