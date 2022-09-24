package models;

import enums.ProductCategory;

import java.util.List;
import java.util.Set;

public class Products{
    //FIELDS--------------------------------------------------------------------->
    private static long productId;
    private static String productName;
    private static ProductCategory category;
    private static Double ratePerUnit;
    private static Integer quantity;
    private static Double amount;


    //CONSTRUCTOR------------------------------------------------------------------>

    //Empty Args
    public Products(){

    }

    //Full Args
    public Products(long productId, String productName, ProductCategory category, Double ratePerUnit) {
        Products.productId = productId;
        Products.productName = productName;
        Products.category = category;
        Products.ratePerUnit = ratePerUnit;

    }

    public Products(long productId, String productName, ProductCategory category,
                    Double ratePerUnit, Integer quantity) {
        Products.productId = productId;
        Products.productName = productName;
        Products.category = category;
        Products.ratePerUnit = ratePerUnit;
        Products.quantity = quantity;

    }


    //GETTERS & SETTERS------------------------------------------------------------------>
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        Products.productName = productName;
    }

    public long getProductId() {
        return productId;
    }

    public void setProductId(long productId) {
        Products.productId = productId;
    }

    public ProductCategory getCategory() {
        return category;
    }

    public void setCategory(ProductCategory category) {
        Products.category = category;
    }

    public Double getRatePerUnit() {
        return ratePerUnit;
    }

    public void setRatePerUnit(Double ratePerUnit) {
        Products.ratePerUnit = ratePerUnit;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        Products.quantity = quantity;
    }

    public Double getAmount() {
        amount = quantity * ratePerUnit; //VAT INCLUSIVE
        return amount;
    }


    @Override
    public String toString() {
        return "Products{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", category=" + category +
                ", ratePerUnit=" + ratePerUnit +
                ", quantity=" + quantity +
                ", amount=" + amount +
                '}';
    }


}
