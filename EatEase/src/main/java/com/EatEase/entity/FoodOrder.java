package com.EatEase.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;

@Data
@NoArgsConstructor
@Entity
public class FoodOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long OrderId;
    private LocalDateTime orderDate;
    @ElementCollection
    @CollectionTable(name = "orderItems")
    private List<Item> items;
    private String status;
    @OneToOne(cascade = CascadeType.ALL)
    private OrderBill orderBill;

    @ManyToOne
    private Customer customer;
}
