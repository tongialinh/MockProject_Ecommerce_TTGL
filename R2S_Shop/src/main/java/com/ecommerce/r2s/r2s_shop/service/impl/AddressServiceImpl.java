package com.ecommerce.r2s.r2s_shop.service.impl;

import com.ecommerce.r2s.r2s_shop.entity.Address;
import com.ecommerce.r2s.r2s_shop.repository.AddressRepository;
import com.ecommerce.r2s.r2s_shop.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressServiceImpl implements AddressService {
    @Autowired
    private AddressRepository addressRepository;

    @Override
    public List<Address> getAll() {
        return addressRepository.findAll();
    }
}
