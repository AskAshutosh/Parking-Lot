package Services;

import CustomExceptions.GateNotFoundException;
import CustomExceptions.NoParkingSpotFoundException;
import CustomExceptions.ParkingLotDoesntExist;
import Models.Gate;
import Models.Spot;
import Models.Ticket;
import Models.VehicleType;
import Repository.GateRepository;
import Repository.TicketRepository;
import Strategy.SpotAssignment.SpotAssignmentStrategy;

import java.util.Date;

public class TicketService {
    private SpotAssignmentStrategy spotAssignmentStrategy;
    private GateService gateService;
    private TicketRepository ticketRepository;

    public TicketService(SpotAssignmentStrategy spotAssignmentStrategy,
                         GateService gateService, TicketRepository ticketRepository) {
        this.spotAssignmentStrategy = spotAssignmentStrategy;
        this.gateService = gateService;
        this.ticketRepository = ticketRepository;
    }

    public Ticket generateTicket(String vehicleNumber,
                                 VehicleType vehicleType, int gateId) throws NoParkingSpotFoundException, ParkingLotDoesntExist, GateNotFoundException {
        //store generated ticket in DB
        Gate gate = gateService.getGateById(gateId);
        if(gate == null){
            throw new GateNotFoundException();
        }
        Spot spot;
        try{
            spot = spotAssignmentStrategy.assignSpot(vehicleType,gate);
        } catch (Exception e) {
            throw e;
        }

        Date entryTime = new Date();
        Ticket ticket = ticketRepository.createTicket(vehicleNumber, spot, entryTime);
        System.out.println("ticket: "+ticket);
        return ticket;
    }
}
