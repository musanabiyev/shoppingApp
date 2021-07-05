package com.company.product.service;

import com.company.product.domain.Product;
import com.company.product.domain.es.CategoryEs;
import com.company.product.domain.es.CompanyEs;
import com.company.product.domain.es.ProductEs;
import com.company.product.repository.es.ProductEsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class ProductEsService {

    private final ProductEsRepository productEsRepository;


    public Mono<ProductEs> saveNewProduct(Product product) {
        return productEsRepository.save(
                ProductEs.builder()
                        .active(product.getActive())
                        .code(product.getCode())
                        .description(product.getDescription())
                        .features(product.getFeatures())
                        .id(product.getId())
                        .name(product.getName())
                        //TODO get compny name and code
                        .seller(CompanyEs.builder().id(product.getCompanyId()).name("test").build())
                        //TODO get compny name and code
                        .category(CategoryEs.builder().id(product.getCategoryId()).name("test").build())
                        .build());
    }

    public Flux<ProductEs> findAll() {
        return productEsRepository.findAll();
    }
}
