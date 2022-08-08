package com.revature.SpringBootDemo.models;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "shops")
@Data
public class Shop {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "shop_id")
    private int id;

    @Column(name = "shop_name",unique = true, nullable = false)
    private String shopName;

    @Column(name = "inv_count", nullable = false)
    private int inventoryCount;

    public Shop() {
    }

    public Shop(int id, String shopName, int inventoryCount) {
        this.id = id;
        this.shopName = shopName;
        this.inventoryCount = inventoryCount;
    }

    public Shop(String shopName, int inventoryCount) {
        this.shopName = shopName;
        this.inventoryCount = inventoryCount;
    }
}
