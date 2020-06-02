import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

public class VehicleTest {
    @Test
    void PassengerSeatingNowExeption() {
        Person person = new Person("Майкл", "Джексон", 19);
        Bus bus = new Bus(5);
        assertThrows(PassengerSeatingNowExeption.class, () -> {
            bus.addPassenger(person);
            bus.addPassenger(person);
        });
    }

    @Test
    void IncorrectSeatsExeption() {
        assertThrows(IncorrectSeatsExeption.class, () -> {
            Bus bus = new Bus(-8);
        });
    }
    @Test
    void NoMorePlaceExeption(){
        Person person1 = new Person("Джон","Ватсон",47);
        Policeman policeman1 = new Policeman("Боб","Шевченко",23);
        Fireman fireman1 = new Fireman("Стас","Волощук",47);
        Bus bus = new Bus(2);
        bus.addPassenger(person1);
        bus.addPassenger(policeman1);
        assertThrows(NoMorePlaceExeption.class, () -> {
            bus.addPassenger(fireman1);
        });
    }
    @Test
    void NoPassengerExeption() {
        Person person = new Person("Рікардо","Мілас",60);
        Bus bus = new Bus(5);
        assertThrows(NoPassengerExeption.class, () -> {
            bus.getOffPerson(person);
        });
    }

}
