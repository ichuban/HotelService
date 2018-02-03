package Week5;

import java.time.LocalDate;

public class Guest {

    private String name;
    private String lastName;
    private static LocalDate dayOfBirth;

    public Guest(String name, String lastName, LocalDate dayOfBirth) {
        this.name = name;
        this.lastName = lastName;
        this.dayOfBirth = dayOfBirth;


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public static LocalDate getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(LocalDate dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }
}
