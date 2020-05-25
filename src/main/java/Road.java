import java.util.HashSet;
import java.util.Set;


public class Road {
    public Set<Vehicle> carsInRoad = new HashSet<>();

    public void addCarToRoad(Vehicle vehicle){
        carsInRoad.add(vehicle);
    }

    public int getCountOfPass(){
        int sumPass = 0;
        for (Vehicle vehicle:
        carsInRoad){
            sumPass+= vehicle.occupiedPlaces();
        }
        return sumPass;
    }
}
