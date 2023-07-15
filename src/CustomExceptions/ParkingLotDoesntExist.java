package CustomExceptions;

public class ParkingLotDoesntExist extends Exception{
    public ParkingLotDoesntExist() {
        super("Parking lot does not exist!");
    }
}
