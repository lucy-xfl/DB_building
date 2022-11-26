package com.laioffer.flagcamp.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "Transaction")
public class Transaction implements Serializable {

    private static final long serialVersionUID = 8436097833452420298L;

    @Id
    private Integer Product_id;

    private String Buyer_id;

    @ManyToOne
    private User Buyer;



    private String Seller_id;
    @ManyToOne
    private User Seller;

    private Double Score_to_Buyer;

    private Double Score_to_Seller;

    private String Date;


    public String getBuyer_id() {
        return Buyer_id;
    }

    public void setBuyer_id(String buyer_id) {
        Buyer_id = buyer_id;
    }

    public String getSeller_id() {
        return Seller_id;
    }

    public void setSeller_id(String seller_id) {
        Seller_id = seller_id;
    }

    public Double getScore_to_Buyer() {
        return Score_to_Buyer;
    }

    public void setScore_to_Buyer(Double score_to_Buyer) {
        Score_to_Buyer = score_to_Buyer;
    }

    public Double getScore_to_Seller() {
        return Score_to_Seller;
    }

    public void setScore_to_Seller(Double score_to_Seller) {
        Score_to_Seller = score_to_Seller;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public Integer getProduct_id() {
        return Product_id;
    }

    public void setProduct_id(Integer product_id) {
        Product_id = product_id;
    }
}
