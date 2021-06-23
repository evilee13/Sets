package com.bft.com;

import java.util.*;

public class App {
    public static void main(String[] args) {
        Person person1 = new Person("Ольга", "Иванова");
        Person person2 = new Person("Алексей", "Петров");
        Person person3 = new Person("Ольга", "Михайлова");
        Person person4 = new Person("Иван", "Иванов");
        Person person5 = new Person("Вячеслав", "Антонов");
        Person person6 = new Person("Александр", "Кузьмин");
        Person person7 = new Person("Ольга", "Иванова");

        System.out.println(person1.equals(person3));

        ArrayList<Person> personArrayList = new ArrayList<>(Arrays.asList(person1, person2, person3, person4, person5, person6, person7));

        HashSet<Person> listOfPerson = new HashSet<>(personArrayList);

        for (Person p : listOfPerson)
            System.out.println(p);

        TreeSet<Person> sortedList = new TreeSet<Person>(personArrayList);

        for (Person i : sortedList)
            System.out.println(i);

        LinkedHashSet<Person> linkedList = new LinkedHashSet(personArrayList);

        for (Person p : linkedList)
            System.out.println(p);

    }
}
