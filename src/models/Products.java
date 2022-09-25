package models;

import enums.ProductCategory;

import java.util.List;
import java.util.Set;

public class Products{
    //FIELDS--------------------------------------------------------------------->
    private  long productId;
    private String productName;
    private ProductCategory category;
    private Double ratePerUnit;
    private Integer quantity;
    private Double amount;


    //CONSTRUCTOR-------------------------------------------------------------------------------------->
    public Products(){

    }

    public Products(long productId, String productName, ProductCategory category, Double ratePerUnit, Integer quantity) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
        this.ratePerUnit = ratePerUnit;
        this.quantity = quantity;
    }

    //GETTERS & SETTERS------------------------------------------------------------------>


    public long getProductId() {
        return productId;
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public ProductCategory getCategory() {
        return category;
    }

    public void setCategory(ProductCategory category) {
        this.category = category;
    }

    public Double getRatePerUnit() {
        return ratePerUnit;
    }

    public void setRatePerUnit(Double ratePerUnit) {
        this.ratePerUnit = ratePerUnit;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getAmount() {
        amount = this.quantity * this.ratePerUnit;
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
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
