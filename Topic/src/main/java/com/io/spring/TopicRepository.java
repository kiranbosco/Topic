package com.io.spring;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface TopicRepository extends MongoRepository<Topic,String> {

}
