package com.sherry.ticket;

public class StudentTicket extends Ticket{
    float off = 0.1f;
    public StudentTicket(Station start, Station destination, int amount){
        super(start, destination, amount);
    }
    @Override
    public float price(){
        int distance = start.id - destination.id;
        if(start.id == 100 && destination.id ==200 || destination.id == 100 && start.id ==200){
            return 600*off;
        }else if(start.id == 200 && destination.id ==300 || destination.id == 200 && start.id ==300) {
            return 900*off;
        }else if(Math.abs(distance) == 200){
            return 1500*off;
        }
        return 0;
    }
    public void print(){
        System.out.println("student ticket" + "\t" + start.name + "to" + destination.name + "\t" +  amount + "\t" + price()*amount);
    }
}
