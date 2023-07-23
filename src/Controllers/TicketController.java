package Controllers;

import CustomExceptions.GateNotFoundException;
import CustomExceptions.NoParkingSpotFoundException;
import CustomExceptions.ParkingLotDoesntExist;
import DTO.GenerateBillRequestDTO;
import DTO.GenerateTicketRequestDTO;
import Models.Bill;
import Models.Ticket;
import Services.BillService;
import Services.TicketService;

public class TicketController {
    private TicketService ticketService;

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    public Ticket generateTicket(GenerateTicketRequestDTO requestDTO) throws NoParkingSpotFoundException, ParkingLotDoesntExist, GateNotFoundException {
        return ticketService.generateTicket(requestDTO.getVehicleNumber(), requestDTO.getVehicleType(), requestDTO.getGateId());
    }
}
