package com.example.mongoDbProject.controller;

import java.util.ArrayList;
import java.util.List;

import com.example.mongoDbProject.model.Restaurent;
import com.example.mongoDbProject.repo.ResRepo;
import com.fasterxml.jackson.databind.ser.std.StdKeySerializers.EnumKeySerializer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResController 
{

    @Autowired
    public ResRepo resRepo;

    @GetMapping(value="/all")
    public List<Restaurent> getAllOrder()
    {
        List<Restaurent>temp=new ArrayList<Restaurent>();
        temp=resRepo.findAll();
        return temp;
    }

    @PostMapping(value = "/create")
    public String createOrder(@RequestBody Restaurent restaurent)
    {
        Restaurent insertedRes = resRepo.insert(restaurent);

        return "Order sofol !!!\n"+info(restaurent);

    }

    
    @DeleteMapping("/remove/{orderId}")
    public String delete(@PathVariable("orderId") Restaurent orderId) 
    {
        try 
        {
            resRepo.delete(orderId);
            return "Order ti delete kora hoyeche, "+orderId.getCustomerName();
        } catch (Exception MissingPathVariableException) 
        {
            return "nai";
        }
    }

    @PutMapping
    public Restaurent update(@RequestBody Restaurent restaurent)
    {
        return resRepo.save(restaurent);
    }

    @PostMapping(value = "/info/{orderId}")
    public String info(@PathVariable("orderId") Restaurent restaurent) 
    {
        return "===== Order INFO =====\nCustomer Name : "+restaurent.getCustomerName()+
        "\nItem : "+restaurent.getItems()+"\nCost : "+restaurent.getCost()+
        "\nPayment status : "+restaurent.isPaid()+"\n";
    }

    @GetMapping(value="/info")
    public String brief()
    {
        List<Restaurent>temp=new ArrayList<Restaurent>();
        temp=resRepo.findAll();
        String ret="Total Current Order : ";
        ret+=""+temp.size()+"\n";
        double val=0.0;
        int paidC=0;
        int unpaidC=0;
        for(int i=0;i<temp.size();i++)
        {
            Restaurent curr=temp.get(i);
            if(curr.isPaid())
            {
                val+=curr.getCost();
                paidC++;
            }else
            {
                unpaidC++;
            }
        }
        ret+="Total Profit (Paid): "+val+"\n";
        ret+="Paid orders : "+paidC+" BDT\n";
        ret+="UnPaid orders : "+unpaidC+"\n";
        return ret;
    }
}
