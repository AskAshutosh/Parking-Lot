package Models;

import java.util.List;

public class Floor {
    private BaseModel baseModel;
    private List<Spot> spotList;
    private int floorNumber;

    public Floor(BaseModel baseModel, List<Spot> spotList, int floorNumber) {
        this.baseModel = baseModel;
        this.spotList = spotList;
        this.floorNumber = floorNumber;
    }

    public BaseModel getBaseModel() {
        return baseModel;
    }
//    public int getId(){
//        return baseModel.getId();
//    }

    public List<Spot> getSpotList() {
        return spotList;
    }

    public int getFloorNumber() {
        return floorNumber;
    }
}
