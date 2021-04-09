package com.udacity.ordering.orderingservice.order;

import java.math.BigDecimal;

/**
 * Represents the price of a given vehicle, including currency.
 */
public class Order {
    private Long id;
    private String clientName;
    private String clientAddress;
    private String clientPhoneNumber;
    private String clientEmail;
    private BigDecimal price;
    private BigDecimal tax;
    private double taxRate;
    private Long vehicleId;

    public Order() {
    }

    public Order(Long id, String clientName, String clientAddress, String clientPhoneNumber, String clientEmail, BigDecimal price, BigDecimal tax, double taxRate, Long vehicleId) {
        this.id = id;
        this.clientName = clientName;
        this.clientAddress = clientAddress;
        this.clientPhoneNumber = clientPhoneNumber;
        this.clientEmail = clientEmail;
        this.price = price;
        this.tax = tax;
        this.taxRate = taxRate;
        this.vehicleId = vehicleId;
    }

    public Order(String clientName, String clientAddress, String clientPhoneNumber, String clientEmail, BigDecimal price, BigDecimal tax, double taxRate, Long vehicleId) {
        this.clientName = clientName;
        this.clientAddress = clientAddress;
        this.clientPhoneNumber = clientPhoneNumber;
        this.clientEmail = clientEmail;
        this.price = price;
        this.tax = tax;
        this.taxRate = taxRate;
        this.vehicleId = vehicleId;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getClientAddress() {
        return clientAddress;
    }

    public void setClientAddress(String clientAddress) {
        this.clientAddress = clientAddress;
    }

    public String getClientPhoneNumber() {
        return clientPhoneNumber;
    }

    public void setClientPhoneNumber(String clientPhoneNumber) {
        this.clientPhoneNumber = clientPhoneNumber;
    }

    public String getClientEmail() {
        return clientEmail;
    }

    public void setClientEmail(String clientEmail) {
        this.clientEmail = clientEmail;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getTax() {
        return tax;
    }

    public void setTax(BigDecimal tax) {
        this.tax = tax;
    }

    public double getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(double taxRate) {
        this.taxRate = taxRate;
    }

    public Long getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(Long vehicleId) {
        this.vehicleId = vehicleId;
    }
}
