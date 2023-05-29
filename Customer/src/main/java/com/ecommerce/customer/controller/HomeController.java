package com.ecommerce.customer.controller;

import com.ecommerce.r2s.r2s_shop.dto.ProductDTO;
import com.ecommerce.r2s.r2s_shop.entity.Category;
import com.ecommerce.r2s.r2s_shop.entity.Customer;
import com.ecommerce.r2s.r2s_shop.entity.ShoppingCart;
import com.ecommerce.r2s.r2s_shop.service.CategoryService;
import com.ecommerce.r2s.r2s_shop.service.CustomerService;
import com.ecommerce.r2s.r2s_shop.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;
import java.security.Principal;
import java.util.List;

@Controller
public class HomeController {
    @Autowired
    private ProductService productService;

    @Autowired
    private CategoryService categoryService;

    @Autowired
    private CustomerService customerService;

    @RequestMapping(value = {"/index", "/"}, method = RequestMethod.GET)
    public String home(Model model, Principal principal, HttpSession session){
        if(principal != null){
            session.setAttribute("username", principal.getName());
            Customer customer = customerService.findByUsername(principal.getName());
            ShoppingCart cart = customer.getShoppingCart();
            session.setAttribute("totalItems", cart.getTotalItems());
        }else{
            session.removeAttribute("username");
        }
        return "home";
    }

    @GetMapping("/home")
    public String index(Model model){
        List<Category> categories = categoryService.findAll();
        List<ProductDTO> productDtos = productService.findAll();
        model.addAttribute("categories", categories);
        model.addAttribute("products", productDtos);
        return "index";
    }
}
