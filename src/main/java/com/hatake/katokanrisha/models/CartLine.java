package com.hatake.katokanrisha.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "cart_line")
public class CartLine extends DateAudit {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer cartLineId;

    private String productName;

    private BigDecimal quantity = BigDecimal.ONE;

    private BigDecimal unitPrice;

    private BigDecimal grossTotal;

    private BigDecimal discountTotal = BigDecimal.ZERO;

    private BigDecimal netTotal;

    private BigDecimal taxCollected;

    private BigDecimal totalCollected;

    @ManyToOne
    @JoinColumn(name = "cartId")
    private Cart cart;

    private String productId;

    private String storeName;

    private String storeId;

    private Boolean taxable;

    private BigDecimal offerDiscountTotal = BigDecimal.ZERO;

    private String offerName;

    private Long offerId;

    private String couponCode;

    private Long couponId;

    private BigDecimal promoDiscountTotal = BigDecimal.ZERO;

    private String priceType;

    private BigDecimal unitCost = BigDecimal.ZERO;

    private BigDecimal totalCost = BigDecimal.ZERO;

    private Long brandId;

    private String brandName;

    private String categoryName;

    private BigDecimal taxableAmount = BigDecimal.ZERO;

    private BigDecimal taxRate = BigDecimal.ZERO;

}
