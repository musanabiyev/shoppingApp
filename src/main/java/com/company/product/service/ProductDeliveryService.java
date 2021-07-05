package com.company.product.service;

import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class ProductDeliveryService {
    //TODO
    public String getDeliveryInfo(String productId) {
        return "Tomorrow";
    }

    public boolean freedeliveryCheck(String productId, BigDecimal price) {
        //TODO
        return price.compareTo(BigDecimal.ONE) >= 0;
    }
}
