package com.studi.exam.core.entities.order;


import com.studi.exam.core.entities.customer.Customer;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "orders")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private LocalDateTime orderTime;
    @Transient
    private Customer customer;
    @Column(nullable = false)
    private Long idCustomer;
    @Column(nullable = false)
    private Double orderPrice;
    private String orderNumber;
    @OneToMany(
            cascade = {CascadeType.ALL},
            fetch = FetchType.EAGER,
            orphanRemoval = true
    )
    @Column(
            nullable = false
    )
    private List<OrderItem> orderItemList;
}
