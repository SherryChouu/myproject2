package com.sherry.sales;

public class GoldenCustomer extends SilverCustomer {
        public GoldenCustomer(String id, int amount) {
            super(id, amount);
            off = 0.2f;

        }
    }