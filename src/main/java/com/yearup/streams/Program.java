package com.yearup.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();

        people.add(new Person("Lebron", "James", 38));
        people.add(new Person("Mister", "Whoops", 26));
        people.add(new Person("Elon", "Musk", 54));
        people.add(new Person("Donald", "Trump", 76));
        people.add(new Person("Jeff", "Bezos", 63));
        people.add(new Person("Mohammad", "Suleiman", 19));
        people.add(new Person("Ruth", "Houston", 27));
        people.add(new Person("Marie", "Black", 34));
        people.add(new Person("Dennis", "Gooze", 14));
        people.add(new Person("Benson", "Harrison", 46));



    }
}
