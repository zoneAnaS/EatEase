package com.EatEase.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Embeddable
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long itemId;
    private String itemName;
    private String itemImagePath;
    private Double cost;
    @ManyToOne
    private Category category;
    private Boolean isVeg;
    @ManyToOne
    private Restaurant restaurant;
}
