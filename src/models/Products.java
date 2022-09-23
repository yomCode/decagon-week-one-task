package models;

import enums.ProductCategory;

public class Products{
    private long productId;
    private String productName;
    private ProductCategory category;
    private Double ratePerUnit;
    private Integer quantity;
    private Double amount;


    public Products(){

    }

    public Products(long productId, String productName, ProductCategory category, Double ratePerUnit) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
        this.ratePerUnit = ratePerUnit;

    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public long getProductId() {
        return productId;
    }

    public void setProductId(long productId) {
        this.productId = productId;
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

    @Override
    public String toString() {
        return "Products{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", category=" + category +
                ", rate=" + ratePerUnit +
                ", quantity=" + quantity +
                ", amount=" + amount +
                '}';
    }
}
