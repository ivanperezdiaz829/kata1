package software.ulpgc.kata1;

import java.time.LocalDate;
import java.time.Month;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Iván", LocalDate.of(2004, Month.MAY, 13));
        System.out.println(person);
    }
}
