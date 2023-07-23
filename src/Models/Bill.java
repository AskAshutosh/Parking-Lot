package Models;

import java.util.Date;
import java.util.List;

public class Bill {
    private BaseModel baseModel;
    private double amount;
    private Date entryTime;
    private Date exitTime;
    private Vehicle vehicle;
    private List<Payment> payments;

}
