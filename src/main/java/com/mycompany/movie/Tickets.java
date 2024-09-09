/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.movie;

/**
 *
 * @author Rouche Oelofse
 */
public abstract class Tickets implements ITickets {
    double dblDiscount;
    String strCust;
    String title;
    int cusAge;
    int price;
    
    
    public Tickets(String cusName, double dblDiscount) 
    {
        strCust = cusName;
        if(dblSale >= 1000) 
        {
            dblDiscount = dblSale - (dblSale * 0.10);
        }
        else 
        {
            dblDiscount = dblSale;
        }
    }
    @Override
    public String getCustomerName() 
    {
        return strCust;
    }
    @Override
    public double getDiscount() 
    {
        return dblDiscount;
    }
}
