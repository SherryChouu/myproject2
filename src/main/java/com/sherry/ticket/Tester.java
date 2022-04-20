package com.sherry.ticket;

import java.util.ArrayList;
import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        ArrayList<Ticket> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Your start station? (1:Taipei, 2:Taichung, 3:Kaohsiung)");
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
            System.out.println("Your destination station? (1:Taipei, 2:Taichung, 3:Kaohsiung)");
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
            //
            System.out.println("Which kind of ticket? (1)Normal Ticket (2)Student Ticket (3)Elder Ticket");
            int type = Integer.parseInt(scanner.next());
            int n = Integer.parseInt(scanner.next());
            switch (type) {
                case 1:
                    Ticket ticket = new Ticket(start, destination, n);
                    list.add(ticket);
                    break;
                case 2:
                    StudentTicket studentticket = new StudentTicket(start, destination, n);
                    list.add(studentticket);
                    break;
                case 3:
                    ElderTicket elderTicket = new ElderTicket(start, destination, n);
                    list.add(elderTicket);
            }
        }
        for (Ticket t : list) {
            t.print();
        }
    }
}