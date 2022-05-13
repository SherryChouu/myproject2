package com.sherry.sales;

public class MyClass implements MyInterface {
    public void test(){
        System.out.println("hello");
}
    public int max(int a, int b){
        if(a > b) {
            return a;
        }else if(b > a){
            return b;
        }
        return 0;
    }
}

