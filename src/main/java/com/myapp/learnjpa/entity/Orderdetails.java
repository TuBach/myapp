package com.myapp.learnjpa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "orderdetails")
public class Orderdetails implements Serializable {

    @Id
    @Column(name = "orderNumber")
    private long orderNumber;
    @Id
    @Column(name = "productCode")
    private String productCode;
    @Column(name = "quantityOrdered")
    private long quantityOrdered;
    @Column(name = "priceEach")
    private double priceEach;
    @Column(name = "orderLineNumber")
    private long orderLineNumber;


    public long getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(long orderNumber) {
        this.orderNumber = orderNumber;
    }


    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }


    public long getQuantityOrdered() {
        return quantityOrdered;
    }

    public void setQuantityOrdered(long quantityOrdered) {
        this.quantityOrdered = quantityOrdered;
    }


    public double getPriceEach() {
        return priceEach;
    }

    public void setPriceEach(double priceEach) {
        this.priceEach = priceEach;
    }


    public long getOrderLineNumber() {
        return orderLineNumber;
    }

    public void setOrderLineNumber(long orderLineNumber) {
        this.orderLineNumber = orderLineNumber;
    }

}
