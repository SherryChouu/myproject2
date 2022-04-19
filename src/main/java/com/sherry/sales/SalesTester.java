package com.sherry.sales;

import com.sherry.sales.Customer;
import com.sherry.sales.GoldenCustomer;
import com.sherry.sales.SilverCustomer;

import java.util.ArrayList;
import java.util.List;

//一般客戶-滿千送百
//銀級客戶-滿千送百，再送百元還元金
//金級客戶-滿千送兩百，再送二百還元金

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
        for(Customer c: customers) {
            c.print();
        }
        Customer c1 = new Customer("001",1200);
        Customer c2 = new Customer("002",800);
        SilverCustomer c3 = new SilverCustomer("003",2000);
        GoldenCustomer c4 = new GoldenCustomer("004",5000);
        DiscountCustomer c5 = new DiscountCustomer("006", 900);
        c1.print();
        c2.print();
        c3.print();
        c4.print();
        c5.print();

        }
    }
