package com.sherry.ticket;

import java.security.PublicKey;

public class Station {
    public static final Station TAIPEI_STATION = new Station(100, "taipei");
    public static final Station TAICHUNG_STATION = new Station(200, "taichung");
    public static final Station KAOHSIUNG_STATION = new Station(300, "kaohsiung");
    int id;
    String name;
    public Station(int id, String name){
        this.id = id;
        this.name = name;
    }
}