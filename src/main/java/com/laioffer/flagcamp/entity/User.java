package com.laioffer.flagcamp.entity;
import java.io.Serializable;
import java.util.List;

import javax.persistence.*;


@Entity
@Table(name = "User")
public class User implements Serializable {

    private static final long serialVersionUID = 8734140534986494039L;

    @Id
    private String email;

    private String Name;
    private String password;
    private String phone;
    private Integer Zipcode;
    private String Address;
    private double Score_as_buyer;
    private double Score_as_seller;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getZipcode() {
        return Zipcode;
    }

    public void setZipcode(Integer zipcode) {
        Zipcode = zipcode;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public double getScore_as_buyer() {
        return Score_as_buyer;
    }

    public void setScore_as_buyer(float score_as_buyer) {
        Score_as_buyer = score_as_buyer;
    }

    public double getScore_as_seller() {
        return Score_as_seller;
    }

    public void setScore_as_seller(float score_as_seller) {
        Score_as_seller = score_as_seller;
    }
}
