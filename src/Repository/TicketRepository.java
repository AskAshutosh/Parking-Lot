package Repository;

import Models.BaseModel;
import Models.Spot;
import Models.Ticket;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class TicketRepository {
    private Map<Integer, Ticket> ticketMap;
    private int idSequence = 0;

    public TicketRepository() {
        ticketMap = new HashMap<>();
    }
    public Ticket createTicket(String vehicleNumber,
                               Spot assignedSpot, Date entryTime){
        //Insert query in DB
        BaseModel baseModel = new BaseModel(idSequence,
                new Date() , new Date());
        Ticket ticket = new Ticket(baseModel, vehicleNumber, assignedSpot, entryTime);
        ticketMap.put(idSequence,ticket);
        idSequence++;
        return ticket;
    }
}
