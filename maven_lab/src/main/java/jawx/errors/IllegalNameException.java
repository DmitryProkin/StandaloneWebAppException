package jawx.errors;
import javax.xml.ws.WebFault;
@WebFault(faultBean = "jaxws.errors.MotorbikeServiceFault")
public class IllegalNameException extends Exception {
    private static final long serialVersionUID = -6647544772732631047L;
    private final MotorbikeServiceFault fault;
    public IllegalNameException(String message, MotorbikeServiceFault fault) {
        super(message);
        this.fault = fault;
    }
    public IllegalNameException(String message, MotorbikeServiceFault fault, Throwable cause) {
        super(message, cause);
        this.fault = fault;
    }
    public MotorbikeServiceFault getFaultInfo() {
        return fault;
    }
}