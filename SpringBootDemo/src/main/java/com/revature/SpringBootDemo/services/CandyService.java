package com.revature.SpringBootDemo.services;

import com.revature.SpringBootDemo.models.Candy;

import java.util.List;

public interface CandyService {

    // Create a new candy
    boolean createCandy(Candy candy);

    // Get candy by ID
    Candy getCandyById(int id);

    // Get all candies
    List<Candy> getAllCandies();

    // Update a candy
    boolean updateCandy(Candy candy);

    // Delete a candy
    boolean deleteCandy(Candy candy);
}
