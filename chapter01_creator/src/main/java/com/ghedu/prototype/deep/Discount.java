package com.ghedu.prototype.deep;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
public class Discount implements Serializable, Cloneable {
    private String type;
    private float rate;
    private List<Product> products;

    @Override
    public Object clone() {
        Discount copyDiscount = null;
        try {
            copyDiscount = (Discount) super.clone();
            if (copyDiscount.getProducts() != null && copyDiscount.getProducts().size() > 0) {
                List<Product> productList = new ArrayList<>();
                for (Product product : copyDiscount.getProducts()) {
                    productList.add((Product) product.clone());
                }
                copyDiscount.setProducts(productList);
            }
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        return  copyDiscount;
    }
}
