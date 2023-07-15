package Services;

import Models.Gate;
import Repository.GateRepository;

public class GateService {
    private GateRepository gateRepository;

    public GateService(GateRepository gateRepository) {
        this.gateRepository = gateRepository;
    }

    public Gate getGateById(int gateId){
        return gateRepository.getGateById(gateId);
    }
}
