package com.sherry.ticket;

import java.util.ArrayList;
import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        ArrayList<Ticket> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("Your start station? (1)taipei (2)taichung(3)kaohsiung");
            int choice = Integer.parseInt(scanner.next());
            if (choice == 0) {
                break;
            }
            Station start = null;
            switch (choice) {
                case 1:
                    start = Station.TAIPEI_STATION;
                    break;
                case 2:
                    start = Station.TAICHUNG_STATION;
                    break;
                case 3:
                    start = Station.KAOHSIUNG_STATION;
                    break;
            }
            System.out.println("Your destination station? (1)taipei (2)taichung(3)kaohsiung");
            int choice1 = Integer.parseInt(scanner.next());
            Station destination = null;
            switch (choice1) {
                case 1:
                    destination = Station.TAIPEI_STATION;
                    break;
                case 2:
                    destination = Station.TAICHUNG_STATION;
                    break;
                case 3:
                    destination = Station.KAOHSIUNG_STATION;
                    break;
            }
            System.out.println("Which kind of ticket? (1)normal (2)student (3)elder");
            int type = Integer.parseInt(scanner.next());
            int amount = Integer.parseInt(scanner.next());
            switch (type) {
                case 1:
                    Ticket ticket = new Ticket(start, destination, amount);
                    list.add(ticket);
                    break;
                case 2:
                    StudentTicket studentticket = new StudentTicket(start, destination, amount);
                    list.add(studentticket);
                    break;
                case 3:
                    ElderTicket elderticket = new ElderTicket(start, destination, amount);
                    list.add(elderticket);
                    break;
            }
        }
        for(Ticket t: list){
            t.print();
            }
        }
    }