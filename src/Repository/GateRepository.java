package Repository;

import Models.Gate;

import java.util.HashMap;
import java.util.Map;

public class GateRepository {
    private Map<Integer, Gate> map;

    public GateRepository(){
        map = new HashMap<>();
    }

    //to add data ; replicating inserting to DB
    public GateRepository(Map<Integer, Gate> map){
        this.map = map;
    }

    public Gate getGateById(int gateId){
        return map.get(gateId);
    }
}
