/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.it17323.reponse;

import com.poly.it17323.domainmodel.Product;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 *
 * @author hangnt
 */
@Getter
@Setter
@ToString
public class ProductResponse {

    // chua cac thuoc tinh => hien thi len JTable
    private Long productId;
    private String categoryName;
    private String categoryCode;
    private String productCode;
    private String productName;
    private Float price;
    private String description;

    public ProductResponse() {
    }

    // mapping du lieu
    public ProductResponse(Product product) {
        this.productId = product.getId();
        this.categoryName = product.getCategory().getCategoryName();
        this.categoryCode = product.getCategory().getCategoryCode();
        this.productCode = product.getProductCode();
        this.productName = product.getProductName();
        this.price = product.getPrice();
        this.description = product.getDescription();
    }

}
