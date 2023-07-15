package Strategy.SpotAssignment;

import CustomExceptions.NoParkingSpotFoundException;
import CustomExceptions.ParkingLotDoesntExist;
import Models.*;
import Repository.ParkingLotRepository;

public class NearestSpotAssignmentStrategy implements SpotAssignmentStrategy{
    private ParkingLotRepository repository;

    public NearestSpotAssignmentStrategy(ParkingLotRepository repository) {
        this.repository = repository;
    }

    @Override
    public Spot assignSpot(VehicleType vehicleType, Gate gate) throws NoParkingSpotFoundException, ParkingLotDoesntExist {
        ParkingLot parkingLot = repository.getParkingLotByGateId(gate.getBaseModel().getId());
        if(parkingLot != null){
            return getAvailableSpot(parkingLot,vehicleType);
        }
        throw new ParkingLotDoesntExist();
    }

    private Spot getAvailableSpot(ParkingLot parkingLot, VehicleType vehicleType) throws NoParkingSpotFoundException {
        for (Floor floor : parkingLot.getFloorList()) {
            for (Spot spot : floor.getSpotList()) {
                if(spot.getSpotStatus().equals(SpotStatus.UNOCCUPIED) && spot.getSupportedVehicleType().equals(vehicleType)){
                    return spot;
                }
            }
        }
        throw new NoParkingSpotFoundException("No parking spot available for "+vehicleType.name());
    }
}
