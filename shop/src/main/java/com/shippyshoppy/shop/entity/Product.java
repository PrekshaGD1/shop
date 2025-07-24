package com.shippyshoppy.shop.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String description;

    private Double price;
    private Integer stock;
    private Boolean active;

    private String imageURL;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;


    @ManyToOne
    private Company company;

    @ManyToOne
    private Category category;
}
