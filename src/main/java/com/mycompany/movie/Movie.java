/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.movie;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Rouche Oelofse
 */
public class Movie {

    public static void main(String[] args) {
        String strCustomer = JOptionPane.showInputDialog(null, "Enter the customer name: ");
        double dblSale = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the cost of the movie:"));
        
        Tickets c = new Tickets(strCustomer, dblSale);
        JOptionPane.showMessageDialog(null, "CUSTOMER: " + c.getCustomerName()+ "\n" + 
                                            "DISCOUNT PRICE: R " + c.getDiscount());
    }
}
