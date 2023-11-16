package com.studi.exam.core.entities.order;
import com.studi.exam.core.entities.product.Product;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OrderItem {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long id;
    private Long idProduct;
    @Transient
    private Product product;
    private int quantity;
    private Double price;

}
