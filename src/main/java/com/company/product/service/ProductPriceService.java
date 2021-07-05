package com.company.product.service;

import com.company.product.domain.MoneyTypes;
import com.company.product.repository.mongo.ProductPriceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
@RequiredArgsConstructor
public class ProductPriceService {

    private final ProductPriceRepository productPriceRepository;


    public BigDecimal getMoneyType(String id, MoneyTypes usd) {
        return BigDecimal.TEN;
    }
    //TODO
}
