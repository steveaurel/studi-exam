package com.studi.exam.core.entities.product;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "products")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private double price;
    @ManyToOne
    @JoinColumn (nullable = false)
    private Category category;
    @OneToMany(
            cascade = {CascadeType.ALL},
            fetch = FetchType.EAGER,
            orphanRemoval = true
    )
    private List<Promotion> promotions;
}
