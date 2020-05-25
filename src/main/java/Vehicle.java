import java.util.HashSet;
import java.util.Set;

public abstract class Vehicle<Pass extends Person> {
    private Set<Pass> passengers = new HashSet<>();
    private int seats;

    protected  Vehicle(int seats){
        if(seats<0){
            throw new IncorrectSeatsExeption("Неправильно введено кількість чисел");
        }
        this.seats = seats;
    }
    protected int maxPlace(){
        return seats;
    }
    public Set<Pass> getPassengers(){
        return passengers;
    }
    public void addPassenger(Pass person) {
        if (passengers.size() == maxPlace()) {
            throw new NoMorePlaceExeption("Більше місць немає!");
        }
        if (person.seat = true) {
            throw new PassengerSeatingNowExeption("Пасажир вже сидить");
        }
        person.seat = true;
        passengers.add(person);
    }
    public int occupiedPlaces(){
        return passengers.size();
    }
    public void getOffPerson(Pass person) throws NoPassengerExeption{
        if (!(passengers.contains(person))){
            throw new NoPassengerExeption("Персона не є пасажиром.");
        }
        passengers.remove(person);
    }
}
