package com.EatEase.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@Entity
public class Restaurant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long restaurantId;
    private String restaurantName;
    @OneToOne
    private Address address;
    @OneToOne
    private Owner owner;
    private String contactNumber;
    @OneToMany(mappedBy = "restaurant",cascade = CascadeType.ALL)
    private List<Item> itemList;

}
