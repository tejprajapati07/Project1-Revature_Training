package com.ecommerce.util;

public enum OrderStatus {

    IN_PROGRESS(1, "In Progress"), 
    ORDER_RECEIVED(2, "Order Received"), 
    PRODUCT_PACKED(3, "Product Packed"),
    OUT_FOR_DELIVERY(4, "Out for Delivery"), 
    DELIVERED(5, "Delivered"),
    CANCEL(6, "Cancelled"),
    SUCCESS(7, "Success");

    private Integer id;
    private String name;

    private OrderStatus(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Static method to get the OrderStatus by ID
    public static OrderStatus fromId(Integer id) {
        for (OrderStatus status : values()) {
            if (status.getId().equals(id)) {
                return status;
            }
        }
        return null; // Return null if no matching ID is found
    }
}
