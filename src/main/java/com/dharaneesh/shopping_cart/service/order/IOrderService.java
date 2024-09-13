package com.dharaneesh.shopping_cart.service.order;

import com.dharaneesh.shopping_cart.dto.OrderDto;
import com.dharaneesh.shopping_cart.model.Order;

import java.util.List;

public interface IOrderService {
    Order placeOrder(Long userId);
    OrderDto getOrder(Long orderId);
    List<OrderDto> getUserOrders(Long userId);
}
