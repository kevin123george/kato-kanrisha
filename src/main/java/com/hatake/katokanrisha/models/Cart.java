package com.hatake.katokanrisha.models;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "cart",
        uniqueConstraints = {
                @UniqueConstraint(columnNames = "cartId")
        })
public class Cart extends DateAudit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer cartId;

    private Integer drawerId;

    private String status;

    private Integer customerId;

    private String customerName;

    private String customerEmail;

    private String customerPhone;

    private Integer storeId;

    private String storeName;

    private BigDecimal taxRate;

    private Integer promoCodeId;

    private String promoCode;

    private BigDecimal grossTotal;

    private BigDecimal discountTotal;

    private BigDecimal netTotal;

    private BigDecimal taxCollected;

    private BigDecimal totalCollected;

    @OneToMany(mappedBy = "cart", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @OrderBy("id ASC")
    private List<CartLine> cartLines;

    private BigDecimal offerDiscountTotal;

    private BigDecimal promoDiscountTotal;

    private Boolean isTaxExempt = false;

    private BigDecimal tipTotal = BigDecimal.ZERO;

    private BigDecimal taxableAmount = BigDecimal.ZERO;


}
