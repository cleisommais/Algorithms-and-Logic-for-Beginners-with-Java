package com.course.services;

import com.course.entities.ConsumerEntity;

import java.util.ArrayList;
import java.util.List;


/**
 * ConsumerService is the service responsible to create/update/delete/retrieve ConsumerEntity from database
 *
 * @author cleison.melo
 * @version 1.0
 */

public class ConsumerService {
    /**
     * @param consumer ConsumerEntity
     * @return consumer entity saved previous action, from database
     */
    public ConsumerEntity create(ConsumerEntity consumer) {
        return consumer;
    }

    /**
     * @param consumer ConsumerEntity
     * @param id       ConsumerEntity id
     * @return consumer entity updated previous action, from database
     */
    public ConsumerEntity update(ConsumerEntity consumer, int id) {
        return consumer;
    }

    /**
     * @param id ConsumerEntity id
     * @return null to delete action successful or the object that does not deleted
     */
    public ConsumerEntity delete(int id) {
        return null;
    }

    /**
     * @param id ConsumerEntity id
     * @return consumer by id retrieved from database
     */
    public ConsumerEntity getById(int id) {
        ConsumerEntity consumer = new ConsumerEntity();
        consumer.setFirstName("Cleison");
        consumer.setLastName("Melo");
        consumer.setAge(37);
        consumer.setTelephoneNumber("55-5555-5555");
        return consumer;
    }

    /**
     * @return all consumers from database
     */
    public List<ConsumerEntity> getAll() {
        ConsumerEntity consumer = new ConsumerEntity();
        List<ConsumerEntity> consumerList = new ArrayList<ConsumerEntity>();
        consumer.setFirstName("Cleison");
        consumer.setLastName("Melo");
        consumer.setAge(37);
        consumer.setTelephoneNumber("55-5555-5555");
        consumerList.add(consumer);
        return consumerList;
    }

}
