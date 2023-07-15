package Models;

import java.util.List;

public class ParkingLot {
    private BaseModel baseModel;
    private List<Floor> floorList;
    private List<EntryGate> entryGateList;
    private List<ExitGate> exitGateList;

    public BaseModel getBaseModel() {
        return baseModel;
    }

    public List<Floor> getFloorList() {
        return floorList;
    }

    public List<EntryGate> getEntryGateList() {
        return entryGateList;
    }

    public List<ExitGate> getExitGateList() {
        return exitGateList;
    }

    public ParkingLot(BaseModel baseModel, List<Floor> floorList, List<EntryGate> entryGateList) {
        this.baseModel = baseModel;
        this.floorList = floorList;
        this.entryGateList = entryGateList;
    }
}
