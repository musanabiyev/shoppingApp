package com.company.product.model;

import com.company.product.domain.MoneyTypes;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class ProductResponse {
    private String id;
    private String image;
    private String name;
    private String description;
    private ProductSellerResponse seller;
    private String features;
    private Integer available;
    private boolean freeDelivery;
    private String deliveryIn;
    private BigDecimal price;
    private String categoryId;
    private MoneyTypes moneyType;

}
