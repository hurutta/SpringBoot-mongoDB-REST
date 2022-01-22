package com.example.mongoDbProject.service;

import java.util.List;

import com.example.mongoDbProject.model.Restaurent;

public interface RestaurentService
{
    public List<Restaurent> getAllOrder();
    public String createOrder(Restaurent restaurent);
    public String delete(Restaurent restaurent);
    public Restaurent update(Restaurent restaurent);
    public String info(Restaurent restaurent);
    public String brief();

}