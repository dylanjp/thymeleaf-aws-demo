package lds.stack.demo.controllers;

import lds.stack.demo.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller // Creates it as a spring component and a controller
public class ProductController {

    private ProductService productService;

    @Autowired//dependency injection
    public void setProductService(ProductService productService) {
        this.productService = productService;
    }

    @RequestMapping("/product")//redirects to the index page if no product id is provided
    public String getProduct(){
        return "redirect:/";
    }

    @RequestMapping("/product/{id}")//{} means spring will take off the id value
    public String getProductById(@PathVariable Integer id, Model model){

        model.addAttribute("product", productService.getProduct(id));

        return "product";
    }
}
//Currently not very Robust. I'm assuming the product id will be there and be correct. Exeception handling should be
//should be added but this is merely to demonstrate thymeleaf/aws
