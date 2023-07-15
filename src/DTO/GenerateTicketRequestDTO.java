package DTO;

import Models.VehicleType;

public class GenerateTicketRequestDTO {
    String vehicleNumber;
    VehicleType vehicleType;
    int gateId;

    public GenerateTicketRequestDTO(String vehicleNumber, VehicleType vehicleType, int gateId) {
        this.vehicleNumber = vehicleNumber;
        this.vehicleType = vehicleType;
        this.gateId = gateId;
    }

    public GenerateTicketRequestDTO(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public int getGateId() {
        return gateId;
    }
}
