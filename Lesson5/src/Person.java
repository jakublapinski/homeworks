public class Person implements Comparable<Person> {
    String name;
    String surname;
    String nick;

    public Person(String name, String surname, String nick){
        this.name=name;
        this.surname=surname;
        this.nick=nick;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", nick='" + nick + '\'' +
                '}';
    }

    @Override
    public int compareTo(Person o){
        return this.surname.compareTo(o.name);
    }
}
