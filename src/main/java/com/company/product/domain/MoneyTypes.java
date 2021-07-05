package com.company.product.domain;

public enum MoneyTypes {
    USD("Dollar", "$"),
    EUR("Euro", "E"),
    AZN("AZN", "M");

    private String label;
    private String symbol;

    MoneyTypes(String label, String symbol){
        this.label = label;
        this.symbol = symbol;
    }
}
