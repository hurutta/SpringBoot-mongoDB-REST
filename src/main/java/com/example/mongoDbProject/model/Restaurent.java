package com.example.mongoDbProject.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "restaurent")
public class Restaurent
{
    @Id
    private long orderNo;
    private String customerName;
    private String items;
    private double cost;
    private boolean paid;

    public Restaurent()
    {
        super();
    }

    public Restaurent(long orderNo,String customerName,String items, double cost, boolean paid)
    {
        super();
        this.orderNo=orderNo;
        this.customerName=customerName;
        this.items=items;
        this.cost=cost;
        this.paid=paid;
    }
    
    
    


    /**
     * @return long return the orderNo
     */
    public long getOrderNo() {
        return orderNo;
    }

    /**
     * @param orderNo the orderNo to set
     */
    public void setOrderNo(long orderNo) {
        this.orderNo = orderNo;
    }

    /**
     * @return String return the customerName
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * @param customerName the customerName to set
     */
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    /**
     * @return String return the items
     */
    public String getItems() {
        return items;
    }

    /**
     * @param items the items to set
     */
    public void setItems(String items) {
        this.items = items;
    }

    /**
     * @return double return the cost
     */
    public double getCost() {
        return cost;
    }

    /**
     * @param cost the cost to set
     */
    public void setCost(double cost) {
        this.cost = cost;
    }

    /**
     * @return boolean return the paid
     */
    public boolean isPaid() {
        return paid;
    }

    /**
     * @param paid the paid to set
     */
    public void setPaid(boolean paid) {
        this.paid = paid;
    }

}
