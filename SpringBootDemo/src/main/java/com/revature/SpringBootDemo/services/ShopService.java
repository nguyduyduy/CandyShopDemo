package com.revature.SpringBootDemo.services;

import com.revature.SpringBootDemo.models.Shop;
import java.util.List;

public interface ShopService {

    // Create a new shop
    boolean createShop(Shop shop);

    // Get shop by ID
    Shop getShopById(int id);

    // Get all shops
    List<Shop> getAllShops();

    // Update a shop
    boolean updateShop(Shop shop);

    // Delete a shop
    boolean deleteShop(Shop shop);
}
