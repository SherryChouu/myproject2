package com.sherry.ticket;

public class ElderTicket extends StudentTicket{
    public ElderTicket(Station start, Station destination, int amount){
        super(start, destination, amount);
        off = 0.5f;
    }
    @Override
    public void print(){
        System.out.println("elder ticket" + "\t" + start.name + "to" + destination.name + "\t" + amount + "\t" + price()*amount);
    }
}
