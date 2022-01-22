package com.example.mongoDbProject.controller;

import java.util.List;

import com.example.mongoDbProject.model.Restaurent;
import com.example.mongoDbProject.service.RestaurentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestaurentController 
{

    @Autowired
    public RestaurentService restaurentService;


    @GetMapping(value="/all")
    public List<Restaurent> getAllOrder()
    {
        return restaurentService.getAllOrder();
    }

    @PostMapping(value = "/create")
    public String createOrder(@RequestBody Restaurent restaurent)
    {
        return restaurentService.createOrder(restaurent);
    }
    
    @DeleteMapping("/remove/{orderId}")
    public String delete(@PathVariable("orderId") Restaurent restaurent) 
    {
        return restaurentService.delete(restaurent);
    }

    @PutMapping
    public Restaurent update(@RequestBody Restaurent restaurent)
    {
        return restaurentService.update(restaurent);
    }

    @PostMapping(value = "/info/{orderId}")
    public String info(@PathVariable("orderId") Restaurent restaurent) 
    {
        
        return restaurentService.info(restaurent);
    }

    @GetMapping(value="/info")
    public String brief()
    {
        return restaurentService.brief();
    }
}
