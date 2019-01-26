package Person;

import java.time.LocalDate;

public class Persons {
    private String name;
    private LocalDate birthdate;

    private Persons(String name, LocalDate birthdate){
        this.name=name;
        this.birthdate=birthdate;
        //
    }
    public Persons(String name, int year, int month, int day){
        this(name, LocalDate.of(year,month,day));
    }
    public Persons(String name){
        this(name,LocalDate.now());

    }

    @Override
    public String toString() {
        return "Persons{" +
                "name='" + name + '\'' +
                ", birthdate=" + birthdate +
                '}';
    }
}