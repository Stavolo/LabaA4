public class Car<Pass extends Person> extends Vehicle<Pass> {
    protected Car(int seats) {
        super(seats);
    }
}