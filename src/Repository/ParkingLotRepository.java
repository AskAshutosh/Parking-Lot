package Repository;

import Models.EntryGate;
import Models.Gate;
import Models.ParkingLot;

import java.util.HashMap;
import java.util.Map;

public class ParkingLotRepository {
    private Map<Integer, ParkingLot> parkingLotMap;

    public ParkingLotRepository() {
        parkingLotMap = new HashMap<>();
    }

 //Overriding constructor to insert data; in real project
    //we will have to add insert data to DB
    public ParkingLotRepository(Map<Integer, ParkingLot> parkingLotMap){
        this.parkingLotMap = parkingLotMap;
    }
    public ParkingLot getParkingLotByGateId(int gateId){
        for (Map.Entry<Integer, ParkingLot> entry : parkingLotMap.entrySet()) {
            ParkingLot parkingLot = entry.getValue();
            for (Gate entryGate : parkingLot.getEntryGateList()) {
                if(entryGate.getBaseModel().getId() == gateId)
                    return parkingLot;
            }
        }
        return null;
    }
}
