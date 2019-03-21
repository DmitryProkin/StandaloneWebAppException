import jawx.errors.IllegalNameException;
import jawx.errors.MotorbikeServiceFault;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.ArrayList;
import java.util.List;
@WebService(serviceName = "MotorbikeService", targetNamespace ="http://0.0.0.0:8080/MotorbikeService")
public class MotorbikeWebService {
    @WebMethod(operationName = "getBike")
    public List<Motorbike> getBikes() {
        PostgreSQLDAO dao = new PostgreSQLDAO();
        List<Motorbike> bikes = dao.getBikes();
        return bikes;
    }
    @WebMethod(operationName = "getFind")
    public List<Motorbike> getFind(@WebParam(name = "personRequest") long id, String brand, String model, String color, String fueltank, String weight){

        PostgreSQLDAO dao = new PostgreSQLDAO();
        return dao.getFind(id,brand, model, color, fueltank, weight);
    }
    @WebMethod(operationName = "create")
    public  long create (@WebParam(name = "personRequest") String brand, String model, String color, String fueltank, String weight) throws
            IllegalNameException {
        if ((brand == null || brand.trim().isEmpty()) || (model == null || model.trim().isEmpty()||
        (color == null || color.trim().isEmpty()) || (fueltank == null || fueltank.trim().isEmpty())|| (weight== null || weight.trim().isEmpty()))) {
            MotorbikeServiceFault fault = MotorbikeServiceFault.defaultInstance();
            throw new IllegalNameException("Error: The value of one of the fields is not entered!", fault);
        }
        PostgreSQLDAO dao = new PostgreSQLDAO();

        return  dao.create(brand, model, color, fueltank, weight);
    }
    @WebMethod(operationName = "delete")
    public  String delete (@WebParam(name = "personRequest") long id) throws
            IllegalNameException{
            PostgreSQLDAO dao = new PostgreSQLDAO();
            List<Motorbike> bikes = new ArrayList<>();
            bikes = dao.getFind(id,"","","","","");
            if (bikes.isEmpty()){
            MotorbikeServiceFault fault = MotorbikeServiceFault.defaultInstance();
            throw new IllegalNameException("Error: Field didn't found with this Id !", fault);
    }

        return  dao.delete(id);
    }
    @WebMethod(operationName = "update")
    public  String update (@WebParam(name = "personRequest") long id, String brand, String model, String color, String fueltank, String weight) throws
            IllegalNameException{
        PostgreSQLDAO dao = new PostgreSQLDAO();
        List<Motorbike> bikes = new ArrayList<>();
        bikes = dao.getFind(id,"","","","","");
        if (bikes.isEmpty()){
            MotorbikeServiceFault fault = MotorbikeServiceFault.defaultInstance();
            throw new IllegalNameException("Error: Field didn't found with this Id !", fault);
        }
        return  dao.update(id,brand, model, color, fueltank, weight);
    }
}