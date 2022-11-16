/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.it17323.service.impl;

import com.poly.it17323.domainmodel.Product;
import com.poly.it17323.reponse.ProductResponse;
import com.poly.it17323.repository.ProductRepository;
import com.poly.it17323.service.QuanLyProductService;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hangnt
 */
public class QuanLyProductServiceImpl implements QuanLyProductService {

    private ProductRepository productRepository = new ProductRepository();

    @Override
    public List<ProductResponse> getAllProducts() {
//        B1: Lay list tu repository 
        List<Product> lists = productRepository.getAll();
        List<ProductResponse> responses = new ArrayList<>();
//        B2: Convert list tu repository sang list response
        for (Product product : lists) {
            ProductResponse productResponse = new ProductResponse(product);
            responses.add(productResponse);
        }
        return responses;
    }

    public static void main(String[] args) {
        List<ProductResponse> lists = new QuanLyProductServiceImpl().getAllProducts();
        for (ProductResponse p : lists) {
            System.out.println(p.toString());
        }
    }
}
