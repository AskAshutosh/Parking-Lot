import Controllers.TicketController;
import CustomExceptions.GateNotFoundException;
import CustomExceptions.NoParkingSpotFoundException;
import CustomExceptions.ParkingLotDoesntExist;
import DTO.GenerateTicketRequestDTO;
import Models.*;
import Repository.GateRepository;
import Repository.ParkingLotRepository;
import Repository.TicketRepository;
import Services.GateService;
import Services.TicketService;
import Strategy.SpotAssignment.NearestSpotAssignmentStrategy;
import Strategy.SpotAssignment.SpotAssignmentStrategy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws NoParkingSpotFoundException, ParkingLotDoesntExist, GateNotFoundException {

        Spot spot1 = new Spot(new BaseModel(1),"SPOT1",VehicleType.CAR );
        Spot spot5 = new Spot(new BaseModel(5), "A5", VehicleType.EV_CAR);
        Spot spot2 = new Spot(new BaseModel(2), "A2", VehicleType.BIKE);
        Spot spot3 = new Spot(new BaseModel(3), "A3", VehicleType.TRUCK);
        Spot spot4 = new Spot(new BaseModel(4), "A4", VehicleType.CAR);

        Floor floor1 = new Floor(new BaseModel(1), Arrays.asList(spot1, spot2), 1);
        Floor floor2 = new Floor(new BaseModel(2), Arrays.asList(spot3, spot4,spot5), 1);

        Gate gate1 = new Gate(new BaseModel(1), "G1");
        Gate gate2 = new Gate(new BaseModel(2), "G2");

        ParkingLot parkingLot = new ParkingLot(new BaseModel(1),
                Arrays.asList(floor1,floor2), Arrays.git(gate1,gate2));


        GateRepository gateRepository = new GateRepository();
        TicketRepository ticketRepository = new TicketRepository();
        ParkingLotRepository parkingLotRepository = new ParkingLotRepository();

        GateService gateService = new GateService(gateRepository);
        SpotAssignmentStrategy spotAssignmentStrategy = new NearestSpotAssignmentStrategy(parkingLotRepository);

        TicketService ticketService = new TicketService(spotAssignmentStrategy, gateService, ticketRepository);
        TicketController ticketController = new TicketController(ticketService);
        GenerateTicketRequestDTO requestDTO = new GenerateTicketRequestDTO("JH01BU2408", VehicleType.EV_CAR, 1);
        Ticket ticket = ticketController.generateTicket(requestDTO);
        System.out.println(ticket);
    }

}