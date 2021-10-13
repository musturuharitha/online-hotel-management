package com.example.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.user.Guest;

public interface profileRepo extends  MongoRepository<Guest, String> {
		Guest findProductById(String Id);

}
