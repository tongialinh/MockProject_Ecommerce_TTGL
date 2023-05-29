package com.ecommerce.r2s.r2s_shop.service;

import com.ecommerce.r2s.r2s_shop.dto.AdminDTO;
import com.ecommerce.r2s.r2s_shop.entity.Admin;

public interface AdminService {
    Admin findByUsername(String username);
    Admin save(AdminDTO adminDTO);
}
