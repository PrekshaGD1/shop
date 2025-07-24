package com.shippyshoppy.shop.entity;

import com.shippyshoppy.shop.Enum.Role;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Column(unique= true , nullable = false)
    private String email;

    @Enumerated(EnumType.STRING)
    private Role role;

    @ManyToOne
    private Company company;


    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

}
