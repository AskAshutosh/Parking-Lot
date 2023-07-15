package Strategy.SpotAssignment;

import CustomExceptions.NoParkingSpotFoundException;
import CustomExceptions.ParkingLotDoesntExist;
import Models.Gate;
import Models.Spot;
import Models.VehicleType;

public interface SpotAssignmentStrategy {
    public Spot assignSpot(VehicleType vehicleType, Gate gate) throws NoParkingSpotFoundException, ParkingLotDoesntExist;
}
