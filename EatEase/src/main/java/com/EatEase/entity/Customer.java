package com.EatEase.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@Entity
@DiscriminatorValue("customer")
public class Customer extends User{
    @OneToOne(mappedBy = "customer",cascade = CascadeType.ALL)
    private FoodCart foodCart;
    @OneToMany(mappedBy = "customer",cascade = CascadeType.ALL)
    private List<FoodOrder> foodOrders;

}
