package Models;

public class Spot {
    private BaseModel baseModel;
    private String spotName;
    private SpotStatus spotStatus;
    private Vehicle vehicle;
    private VehicleType supportedVehicleType;

    public Spot(BaseModel baseModel, String spotName, VehicleType supportedVehicleType) {
        this.baseModel = baseModel;
        this.spotName = spotName;
        this.spotStatus = SpotStatus.UNOCCUPIED;
        this.supportedVehicleType = supportedVehicleType;
    }

    public BaseModel getBaseModel() {
        return baseModel;
    }

    public String spotName() {
        return spotName;
    }

    public SpotStatus getSpotStatus() {
        return spotStatus;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public VehicleType getSupportedVehicleType() {
        return supportedVehicleType;
    }

    @Override
    public String toString() {
        return "Spot{" +
                "baseModel=" + baseModel +
                ", spotId='" + spotName + '\'' +
                ", spotStatus=" + spotStatus +
                ", vehicle=" + vehicle +
                ", supportedVehicleType=" + supportedVehicleType +
                '}';
    }
}
