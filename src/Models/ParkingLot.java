package Models;

import java.util.List;

public class ParkingLot {
    private BaseModel baseModel;
    private List<Floor> floorList;
    private List<Gate> entryGateList;
    private List<ExitGate> exitGateList;

    public BaseModel getBaseModel() {
        return baseModel;
    }

    public List<Floor> getFloorList() {
        return floorList;
    }

    public List<Gate> getEntryGateList() {
        return entryGateList;
    }

    public List<ExitGate> getExitGateList() {
        return exitGateList;
    }

    public ParkingLot(BaseModel baseModel, List<Floor> floorList, List<Gate> entryGateList) {
        this.baseModel = baseModel;
        this.floorList = floorList;
        this.entryGateList = entryGateList;
    }
}
