package com.yearup.streams;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Program {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();

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

        System.out.println("Enter a name you want to search:");
        String searched = scan.nextLine();
        System.out.println();

        List<Person> searchName = people.stream()
                .filter(search -> search.getLastName().contains(searched) || search.getFirstName().contains(searched))
                .collect(Collectors.toList());

        System.out.println(searchName);

        int totalAge = people.stream().map(Person::getAge)
                .reduce(0,(sum, num) -> sum += num);
        double averageAge = (double) totalAge / people.size();
        System.out.println(averageAge);



        List<Integer> sortedAges = people.stream()
                .map(Person::getAge)
                .sorted().collect(Collectors.toList());
        int maxAge = sortedAges.get(sortedAges.size() -1);
        int minAge = sortedAges.get(0);
        System.out.println("Oldest Age : " + maxAge);
        System.out.println("Youngest Age : " + minAge);

       int totalAge = people.stream().map(Person::getAge)
               .reduce(0,(sum, num) -> sum += num);
       double averageAge = (double) totalAge / people.size();
        System.out.println(averageAge);



        List<Integer> sortedAges = people.stream()
                .map(Person::getAge)
                .sorted().collect(Collectors.toList());
        int maxAge = sortedAges.get(sortedAges.size() -1);
        int minAge = sortedAges.get(0);
        System.out.println("Oldest Age : " + maxAge);
        System.out.println("Youngest Age : " + minAge);



    }
}

