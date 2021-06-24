package com.bft.com;

import java.util.*;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setFirstName("Ольга");
        person1.setLastName("Иванова");

        Person person2 = new Person();
        person2.setFirstName("Алексей");
        person2.setLastName("Петров");

        Person person3 = new Person();
        person3.setFirstName("Ольга");
        person3.setLastName("Михайлова");

        Person person4 = new Person();
        person4.setFirstName("Иван");
        person4.setLastName("Иванов");

        Person person5 = new Person();
        person5.setFirstName("Вячеслав");
        person5.setLastName("Антонов");

        Person person6 = new Person();
        person6.setFirstName("Александр");
        person6.setLastName("Кузьмин");

        Person person7 = new Person();
        person7.setFirstName("Ольга");
        person7.setLastName("Иванова");

        System.out.println(person1.equals(person3));

        List<Person> personArrayList = new ArrayList<>(Arrays.asList(person1, person2, person3, person4, person5, person6, person7));

        HashSet<Person> listOfPerson = new HashSet<>(personArrayList);

        for (Person p : listOfPerson)
            System.out.println(p);

        TreeSet<Person> sortedList = new TreeSet<Person>(personArrayList);

        for (Person i : sortedList)
            System.out.println(i);

        LinkedHashSet<Person> linkedList = new LinkedHashSet(personArrayList);

        for (Person p : linkedList)
            System.out.println(p);

//        Map<String, List<Person>> personMap = personArrayList.stream()
//                .collect(Collectors.groupingBy(Person::getFirstName));
//        System.out.println(personMap);

        Map<String, List<Person>> personMap = new HashMap<>();

        for (Person person : personArrayList) {
            String firstName = person.getFirstName();
            if (!personMap.containsKey(firstName)) {
                List<Person> personList = new ArrayList<>();
                personMap.put(firstName, personList);
            }
                personMap.get(firstName).add(person);
            System.out.println("Мапа ключ-значение:"+" "+ personMap);

        }

        List<Person> getValue = personMap.get("Ольга");
        System.out.println("Ключ Ольга:" + " " + getValue);
    }
}



