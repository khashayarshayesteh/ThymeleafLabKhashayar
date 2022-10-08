package com.canon.spring05thymeleaf.controller;

import com.canon.spring05thymeleaf.model.Product;
import com.canon.spring05thymeleaf.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductController {


    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/list")
    public String retrieveAllList(Model model){
        model.addAttribute("productList", productService.listProduct());


        return "product/list";
    }

    @GetMapping("/create-form")
    public String createProductForm(Model model){
        model.addAttribute("product",new Product());

        return "/product/create-product";
    }

}
