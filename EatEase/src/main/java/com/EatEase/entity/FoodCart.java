package com.EatEase.entity;


import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Entity
@NoArgsConstructor
public class FoodCart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cartId;
    @OneToOne
    @JoinColumn(name = "customerId")
    private Customer customer;
    @OneToMany(cascade=CascadeType.ALL)
    @JoinColumn(name = "itemId")
    private List<Item> itemList;
}
