package com.sherry.sales;

import com.sherry.sales.Customer;
import com.sherry.sales.GoldenCustomer;
import com.sherry.sales.SilverCustomer;

import java.util.ArrayList;
import java.util.List;

public class SalesTester {
    public static void main(String[] args) {
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("001", 1200));
        customers.add(new Customer("002", 800));
        customers.add(new SilverCustomer("003", 2000));
        customers.add(new GoldenCustomer("004", 5000));
        customers.add(new DiscountCustomer("005", 900));
        for (int i = 0; i < 5; i++) {
            customers.get(i).print();
        }
        for (Customer c : customers) {
            c.print();
        }
    }
}

