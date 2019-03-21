atpackage jawx.errors;

public class MotorbikeServiceFault {
    private static final String DEFAULT_MESSAGE = "personName cannot be null or empty";
    protected String message;
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public static MotorbikeServiceFault defaultInstance() {
        MotorbikeServiceFault fault = new MotorbikeServiceFault();
        fault.message = DEFAULT_MESSAGE;
        return fault;
    }
}