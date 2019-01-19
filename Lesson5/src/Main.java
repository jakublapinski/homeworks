

import java.util.*;

public class Main {
    public static void main(String[] args) {


        Person person1 = new Person("Jan", "Kowalski", "Kowal");
        Person person2 = new Person("Michal", "Brum", "djfhs");
        Person person3 = new Person("mfhsjfd", "jakjf", "lasjdj");
        Person person4 = new Person("sdhf", "Ajdflksd", "lkdsfj");
        List<Person> persons = new ArrayList<Person>();
        persons.add(person1);
        persons.add(person2);
        persons.add(person3);
        persons.add(person4);
        Collections.sort(persons);
        for (int i=0; i<=3;i++){
            System.out.println(persons.get(i));
        }
    }
}
