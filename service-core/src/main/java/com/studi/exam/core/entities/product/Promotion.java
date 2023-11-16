package com.studi.exam.core.entities.product;

import jakarta.persistence.*;
import jakarta.validation.constraints.DecimalMax;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "promotions")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Promotion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    @DecimalMax(value = "100.0", inclusive = false)
    private Double discount;
}
