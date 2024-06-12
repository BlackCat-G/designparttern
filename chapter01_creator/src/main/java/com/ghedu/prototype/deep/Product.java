package com.ghedu.prototype.deep;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@Data
@AllArgsConstructor
public class Product implements Serializable, Cloneable {
    private String name;
    private float price;

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
