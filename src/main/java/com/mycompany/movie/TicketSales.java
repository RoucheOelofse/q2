/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.movie;

/**
 *
 * @author Rouche Oelofse
 */
public class TicketSales extends Tickets{

    public TicketSales(String cusName, double dblDiscount) {
        super(cusName, dblDiscount);
    }
    

    @Override
    public void print_tickets() {
        System.out.println("CUSTOMER ");
        System.out.println("MOVIE: ");
        System.out.println("COST: ");
        System.out.println("DISCOUNT: ");
        System.out.println("TOTAL: ");
    }
}
