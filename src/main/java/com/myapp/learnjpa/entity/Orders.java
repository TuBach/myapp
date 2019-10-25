package com.myapp.learnjpa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "orders")
public class Orders implements Serializable {

    @Id
    @Column(name = "orderNumber")
    private long orderNumber;
    @Column(name = "orderDate")
    private java.sql.Date orderDate;
    @Column(name = "requiredDate")
    private java.sql.Date requiredDate;
    @Column(name = "shippedDate")
    private java.sql.Date shippedDate;
    @Column(name = "status")
    private String status;
    @Column(name = "comments")
    private String comments;
    @Column(name = "customerNumber")
    private long customerNumber;


    public long getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(long orderNumber) {
        this.orderNumber = orderNumber;
    }


    public java.sql.Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(java.sql.Date orderDate) {
        this.orderDate = orderDate;
    }


    public java.sql.Date getRequiredDate() {
        return requiredDate;
    }

    public void setRequiredDate(java.sql.Date requiredDate) {
        this.requiredDate = requiredDate;
    }


    public java.sql.Date getShippedDate() {
        return shippedDate;
    }

    public void setShippedDate(java.sql.Date shippedDate) {
        this.shippedDate = shippedDate;
    }


    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }


    public long getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(long customerNumber) {
        this.customerNumber = customerNumber;
    }

}
