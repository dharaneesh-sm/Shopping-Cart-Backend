package com.dharaneesh.shopping_cart.dto;

import java.math.BigDecimal;

public class CartItemDto {
    private Long itemId;
    private Integer quantity;
    private BigDecimal unitPrice;
    private com.dharaneesh.shopping_cart.dto.ProductDto product;
}
