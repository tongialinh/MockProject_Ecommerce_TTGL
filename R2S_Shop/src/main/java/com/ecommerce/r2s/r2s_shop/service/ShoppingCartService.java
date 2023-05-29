package com.ecommerce.r2s.r2s_shop.service;

import com.ecommerce.r2s.r2s_shop.entity.Customer;
import com.ecommerce.r2s.r2s_shop.entity.Product;
import com.ecommerce.r2s.r2s_shop.entity.ShoppingCart;

public interface ShoppingCartService {
    ShoppingCart addItemToCart(Product product, int quantity, Customer customer);

    ShoppingCart updateItemInCart(Product product, int quantity, Customer customer);

    ShoppingCart deleteItemFromCart(Product product, Customer customer);
}
