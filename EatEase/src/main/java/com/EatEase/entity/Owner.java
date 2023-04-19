package com.EatEase.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import jdk.jfr.Name;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@DiscriminatorValue("owner")
public class Owner extends User{
    @OneToOne(mappedBy = "owner",cascade = CascadeType.ALL)
    private Restaurant restaurant;
}
