package com.sherry.sales;

import com.sherry.sales.Customer;
import com.sherry.sales.GoldenCustomer;
import com.sherry.sales.SilverCustomer;

public class SalesTester {
    public static void main(String[] args) {
        Customer c1 = new Customer("001",1200);
        Customer c2 = new Customer("002",800);
        SilverCustomer c3 = new SilverCustomer("003",2000);
        GoldenCustomer c4 = new GoldenCustomer("004",5000);
        c1.print();
        c2.print();
        c3.print();
        c4.print();

    }
}
