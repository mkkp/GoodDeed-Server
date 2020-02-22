package com.ketfarkukutya.GoodDeedServer.repository;

import com.ketfarkukutya.GoodDeedServer.model.Deed;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DeedRepository extends MongoRepository<Deed, String> {

}
