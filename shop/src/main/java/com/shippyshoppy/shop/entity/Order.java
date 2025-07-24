package com.shippyshoppy.shop.entity;

import com.shippyshoppy.shop.Enum.OrderStatus;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "CustomerOrder")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double total_amount;

    @Enumerated(EnumType.STRING)
    private OrderStatus status;

    @ManyToOne
    private User user;


    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
