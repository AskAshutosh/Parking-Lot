package Models;

public class Gate {
    private BaseModel baseModel;
    private String gateName;
    public Gate(BaseModel baseModel, String gateName) {
        this.baseModel = baseModel;
        this.gateName = gateName;
    }

    public BaseModel getBaseModel() {
        return baseModel;
    }

    public String getGetName() {
        return gateName;
    }

}
