package com.example.mongoDbProject.service;

import java.util.ArrayList;
import java.util.List;

import com.example.mongoDbProject.model.Restaurent;
import com.example.mongoDbProject.repository.RestaurentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RestaurentService 
{
    @Autowired
    public RestaurentRepository restaurentRepository;

    public RestaurentService(RestaurentRepository restaurentRepository)
    {
        this.restaurentRepository = restaurentRepository;
    }

    public List<Restaurent> getAllOrder()
    {
        List<Restaurent>temporaryList = new ArrayList<Restaurent>();
        temporaryList = restaurentRepository.findAll();
        return temporaryList;
    }

    public String createOrder(Restaurent restaurent)
    {
        restaurentRepository.insert(restaurent);
        return "Order sofol !!!\n" + info(restaurent);
    }

    public String delete(Restaurent restaurent) 
    {
        restaurentRepository.delete(restaurent);
        return "Order ti delete kora hoyeche, " + restaurent.getCustomerName();
    }

    public Restaurent update(Restaurent restaurent)
    {
        return restaurentRepository.save(restaurent);
    }

    public String info(Restaurent restaurent) 
    {
        return "===== Order INFO =====\n Customer Name : " + restaurent.getCustomerName() +
        "\nItem : " + restaurent.getItems() + "\nCost : " + restaurent.getCost() +
        "\nPayment status : " + restaurent.isPaid() + "\n";
    }

    public String brief()
    {
        List<Restaurent>temporary=new ArrayList<Restaurent>();
        temporary = restaurentRepository.findAll();
        
        double profit = 0.0;
        int paidCustomerNo = 0;
        int unpaidCustomerNo = 0;
        for(int i=0; i < temporary.size(); i++)
        {
            Restaurent currentOrder = temporary.get(i);
            if(currentOrder.isPaid())
            {
                profit += currentOrder.getCost();
                paidCustomerNo++;
            }else
            {
                unpaidCustomerNo++;
            }
        }
        String ret = "Total Current Order : ";
        ret += "" + temporary.size() + "\n";
        ret += "Total Profit (Paid): " + " BDT\n";
        ret += "Paid orders : " + paidCustomerNo + "\n";
        ret += "UnPaid orders : " + unpaidCustomerNo + "\n";
        return ret;
    }

}
