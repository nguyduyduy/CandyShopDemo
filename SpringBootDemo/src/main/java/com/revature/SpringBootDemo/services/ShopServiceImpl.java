package com.revature.SpringBootDemo.services;

import com.revature.SpringBootDemo.models.Shop;
import com.revature.SpringBootDemo.repos.ShopRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
@Transactional
public class ShopServiceImpl implements ShopService{

    @Autowired
    private ShopRepo shopRepo;

    @Autowired
    public ShopServiceImpl(ShopRepo shopRepo) {
        this.shopRepo = shopRepo;
    }

    @Override
    public boolean createShop(Shop shop) {
        int pk = shopRepo.save(shop).getId();
        return (pk > 0) ? true: false;
    }

    @Override
    public Shop getShopById(int id) {

        try {
            Optional<Shop> target = shopRepo.findById(id);
            Shop shop = target.get();
            return shop;

        } catch (NoSuchElementException e){
            System.out.println(e.getLocalizedMessage());
        }
        return null;
    }

    @Override
    public List<Shop> getAllShops() {
        return shopRepo.findAll();
    }

    @Override
    public boolean updateShop(Shop shop) {
        return shopRepo.update(shop.getShopName(), shop.getInventoryCount(), shop.getId());
    }

    @Override
    public boolean deleteShop(Shop shop) {

        shopRepo.delete(shop);
        return true;
    }
}
