package com.company.product.startup;

import com.company.product.domain.MoneyTypes;
import com.company.product.model.ProductSaveRequest;
import com.company.product.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.elasticsearch.common.collect.List;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.stream.IntStream;

import static java.util.UUID.randomUUID;

@Component
@RequiredArgsConstructor
public class ProductDemoData {
    private final ProductService productService;

    @EventListener(ApplicationReadyEvent.class)
    public void migrate() {

        Long countOfData = productService.count().block();
        if (countOfData.equals(0L)) {

            IntStream.range(0, 20).forEach(item -> {
                productService.save(
                        ProductSaveRequest.builder()
                                .sellerId(randomUUID().toString())
                                .id(randomUUID().toString())
                                .description("Product description" + item)
                                .money(MoneyTypes.USD)
                                .categoryId(randomUUID().toString())
                                .name("PRODUCT NAME" + item)
                                .features("<li>Black Color</li> <li>Aluminum Case</li> <li>2 Years warranty</li> <li>5 Inch (35x55mm)</li>")
                                .price(BigDecimal.TEN)
                                .images(List.of("hhtps://com.jpg"))
                                .build());


            });
        }

    }
}
