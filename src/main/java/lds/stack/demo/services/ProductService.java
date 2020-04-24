package lds.stack.demo.services;

import lds.stack.demo.objects.Product;

import java.util.List;

public interface ProductService {

    Product getProduct(Integer id);

    List<Product> listProducts();
}
