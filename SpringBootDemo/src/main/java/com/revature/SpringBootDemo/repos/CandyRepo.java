package com.revature.SpringBootDemo.repos;

import com.revature.SpringBootDemo.models.Candy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestParam;

@Repository
@Transactional
public interface CandyRepo extends JpaRepository<Candy, Integer> {

    @Query(value = "UPDATE candies SET candy_name = ?1, candy_price = ?2 WHERE candy_id = ?3", nativeQuery = true)
    public boolean update(String name, double price, int id);

    @Query(value = "SELECT * FROM candies WHERE candy_id = ?1", nativeQuery = true)
    public Candy findById(int id);
}
