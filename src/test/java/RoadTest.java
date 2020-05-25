import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class RoadTest {

    @Test
    void getCountOfHumans() {
        Person person1 = new Person("Джон","Ватсон",47);
        Policeman policeman1 = new Policeman("Боб","Шевченко",23);
        Fireman fireman1 = new Fireman("Стас","Волощук",47);
        Person person2 = new Person("Костя","Лазунчик",19);
        Policeman policeman2 = new Policeman("Вова","Спирит",17);
        Fireman fireman2 = new Fireman("Артем","Шевченко",25);
        Person person3 = new Person("Дмитро","Калинов",28);
        Policeman policeman3 = new Policeman("Джоні","Сінс",37);
        Fireman fireman3 = new Fireman("Рікардо","Мілас",60);
        Road road = new Road();
        FireCar fireCar = new FireCar(4);
        fireCar.addPassenger(fireman1);
        fireCar.addPassenger(fireman2);
        PoliceCar policeCar = new PoliceCar(6);
        policeCar.addPassenger(policeman1);
        policeCar.addPassenger(policeman2);
        Taxi taxi = new Taxi(4);
        taxi.addPassenger(person1);
        taxi.addPassenger(policeman3);
        Bus bus = new Bus(10);
        bus.addPassenger(person2);
        bus.addPassenger(person3);
        bus.addPassenger(fireman3);
        road.carsInRoad.add(fireCar);
        road.carsInRoad.add(policeCar);
        road.carsInRoad.add(taxi);
        road.carsInRoad.add(bus);
        int expected = 9;
        assertEquals(expected,road.getCountOfPass());
    }

    @Test
    void addCarToRoad() {
        Road road = new Road();
        Person person1 = new Person("Джон","Ватсон",47);
        Policeman policeman1 = new Policeman("Біллі","Херрінгтон",54);
        Fireman fireman1 = new Fireman("Рікардо","Мілас",60);
        Bus bus = new Bus(10);
        bus.addPassenger(person1);
        bus.addPassenger(fireman1);
        bus.addPassenger(policeman1);
        road.carsInRoad.add(bus);
        Set<Vehicle> expected = Set.of(bus);
        assertEquals(expected,road.carsInRoad);
    }
} 