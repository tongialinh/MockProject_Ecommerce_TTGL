package com.ecommerce.r2s.r2s_shop.service.impl;

import com.ecommerce.r2s.r2s_shop.dto.AdminDTO;
import com.ecommerce.r2s.r2s_shop.entity.Admin;
import com.ecommerce.r2s.r2s_shop.repository.AdminRepository;
import com.ecommerce.r2s.r2s_shop.repository.RoleRepository;
import com.ecommerce.r2s.r2s_shop.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    private AdminRepository adminRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Override
    public Admin findByUsername(String username) {
        return adminRepository.findByUsername(username);
    }

    @Override
    public Admin save(AdminDTO adminDTO) {
        Admin admin = new Admin();
        admin.setFirstname(adminDTO.getFirstName());
        admin.setLastname(adminDTO.getFirstName());
        admin.setUsername(adminDTO.getUsername());
        admin.setPassword(adminDTO.getPassword());
        admin.setRoles(Arrays.asList(roleRepository.findByName("ADMIN")));
        return adminRepository.save(admin);
    }
}
