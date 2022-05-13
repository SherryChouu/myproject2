package com.sherry.score;

public class Scoring {
    public static void main(String[] args) {
        Student jack = new Student("Jack", 70, 88);
        Student hank = new Student("Hank",70,88);
        GraduateStudent kenny = new GraduateStudent("Kenny",90,80,85);

        jack.print();
        hank.print();
        kenny.print();
    }
}