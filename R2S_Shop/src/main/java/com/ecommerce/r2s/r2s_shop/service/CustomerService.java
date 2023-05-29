package com.ecommerce.r2s.r2s_shop.service;

import com.ecommerce.r2s.r2s_shop.dto.CustomerDTO;
import com.ecommerce.r2s.r2s_shop.entity.Customer;

public interface CustomerService {
    CustomerDTO save(CustomerDTO customerDto);

    Customer findByUsername(String username);

    Customer saveInfor(Customer customer);
}
