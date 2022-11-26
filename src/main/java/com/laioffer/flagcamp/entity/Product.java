package com.laioffer.flagcamp.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.lang.reflect.Modifier;

@Entity
@Table(name = "Product")
public class Product implements Serializable {

    private static final long serialVersionUID = 7551999649936522523L;

    @Id
    private Integer Product_id;
    @OneToOne
    @MapsId
    Transaction info;






    public Transaction getInfo() {
        return info;
    }

    public void setInfo(Transaction info) {
        this.info = info;
    }

    private String Seller_email;
    private String buyer_email;

    private String imageUrl;

    private String name;

    private String description;

    private double price;

    private String Date;
    private String Modifier_Date;

    private String Status;
    private String address;

    public String getSeller_email() {
        return Seller_email;
    }

    public void setSeller_email(String seller_email) {
        Seller_email = seller_email;
    }

    public String getBuyer_email() {
        return buyer_email;
    }

    public void setBuyer_email(String buyer_email) {
        this.buyer_email = buyer_email;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Integer getProduct_id() {
        return Product_id;
    }

    public void setProduct_id(Integer product_id) {
        Product_id = product_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public String getModifier_Date() {
        return Modifier_Date;
    }

    public void setModifier_Date(String modifier_Date) {
        Modifier_Date = modifier_Date;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}