package CustomExceptions;

public class GateNotFoundException extends Exception {
    public GateNotFoundException() {
        super("Gate not found");
    }
}
