package com.course;

import com.course.entities.ConsumerEntity;
import com.course.services.ConsumerService;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
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
        ConsumerEntity consumer = new ConsumerEntity();
        consumer.setFirstName("Cleison");
        consumer.setLastName("Melo");
        consumer.setAge(37);
        consumer.setTelephoneNumber("55-5555-5555");
        ConsumerService service = new ConsumerService();
        Assert.assertEquals(consumer.getFirstName(), service.create(consumer).getFirstName());
    }

    @Test
    public void updateConsumerTest() {
        ConsumerEntity consumer = new ConsumerEntity();
        consumer.setId(1);
        consumer.setFirstName("Cleison");
        consumer.setLastName("Melo");
        consumer.setAge(37);
        consumer.setTelephoneNumber("55-5555-5555");
        ConsumerService service = new ConsumerService();
        Assert.assertEquals(consumer.getLastName(), service.update(consumer, consumer.getId()).getLastName());
    }

    @Test
    public void deleteConsumerTest() {
        ConsumerEntity consumer = new ConsumerEntity();
        consumer.setId(1);
        ConsumerService service = new ConsumerService();
        Assert.assertNull(service.delete(consumer.getId()));
    }

    @Test
    public void getByIdConsumerTest() {
        ConsumerEntity consumer = new ConsumerEntity();
        consumer.setId(1);
        ConsumerService service = new ConsumerService();
        Assert.assertEquals("55-5555-5555", service.getById(consumer.getId()).getTelephoneNumber());
    }

    @Test
    public void getAllConsumerTest() {
        ConsumerService service = new ConsumerService();
        List<ConsumerEntity> consumerList = service.getAll();
        Assert.assertEquals(1, consumerList.size());
        Assert.assertEquals("Melo", consumerList.get(0).getLastName());
    }
}
