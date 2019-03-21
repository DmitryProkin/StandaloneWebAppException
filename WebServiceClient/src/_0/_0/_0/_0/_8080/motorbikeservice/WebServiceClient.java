package _0._0._0._0._8080.motorbikeservice;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class WebServiceClient {


    public static void main(String[] args) throws MalformedURLException {
        URL url = new URL("http://localhost:8080/MotorbikeService?wsdl");
        MotorbikeService motorbikeService = new MotorbikeService(url);
        List<Motorbike> bikes = motorbikeService.getMotorbikeWebServicePort().getBike();
        for (Motorbike motorbike: bikes) {
            System.out.println("Id: " + motorbike.getId() +
                    ", brand='" + motorbike.getBrand() +
                    ", model='" + motorbike.getModel() +
                    ", color='" + motorbike.getColor() +
                    ", fueltank='" + motorbike.getFueltank() +
                    ", weight='" + motorbike.getWeight() );
        }
        System.out.println("Total persons: " + bikes.size());

        Scanner in = new Scanner(System.in);
        String request;


        long id;
        long newId;
        String brand;
        String model;
        String color;
        String fueltank;
        String weight;
        String message="null";
        String answer="null";

        System.out.println("Do you want to change the database?(yes/no)");
        answer = in.nextLine();
        System.out.println(answer);
        while(answer.equals("yes")) {
            System.out.println("select the action: find,create,update, delete");
            String act = in.nextLine();

            switch (act) {
                case "find":{
                    System.out.println("Enter id:");
                    id = in.nextLong();

                    System.out.println("Enter brand:");
                    brand = in.nextLine();brand = in.nextLine();

                    System.out.println("Enter model:");
                    model = in.nextLine();

                    System.out.println("Enter color: ");
                    color = in.nextLine();

                    System.out.println("Enter fueltank: ");
                    fueltank = in.nextLine();

                    System.out.println("Enter weight: ");
                    weight = in.nextLine();

                    List<Motorbike> bikes1 = motorbikeService.getMotorbikeWebServicePort().getFind(id,brand, model, color, fueltank, weight);
                    for (Motorbike motorbike: bikes1) {
                        System.out.println("id: " + motorbike.getId() +
                                ", brand=" + motorbike.getBrand() +
                                ", model=" + motorbike.getModel() +
                                ", color=" + motorbike.getColor() +
                                ", fueltank=" + motorbike.getFueltank() +
                                ", weight=" + motorbike.getWeight() );
                    }
                    break;
                }
                case "create": {
                    try{

                        System.out.println("Enter brand:");
                        brand = in.nextLine();brand = in.nextLine();

                        System.out.println("Enter model:");
                        model = in.nextLine();

                        System.out.println("Enter color: ");
                        color = in.nextLine();

                        System.out.println("Enter fueltank: ");
                        fueltank = in.nextLine();

                        System.out.println("Enter weight: ");
                        weight = in.nextLine();

                        newId = motorbikeService.getMotorbikeWebServicePort().create(brand, model, color, fueltank, weight);
                        System.out.println("newId=" + newId);
                        break;
                    }catch(IllegalNameException ex){
                        Logger.getLogger(PersonServiceFault.class.getName()).log(Level.SEVERE, null, ex);
                    }

                }
                case "delete": {
                    try {
                        System.out.println("Enter id:");
                        id = in.nextLong();
                        message = motorbikeService.getMotorbikeWebServicePort().delete(id);
                        System.out.println(message);
                        break;
                    }catch (IllegalNameException ex){
                        Logger.getLogger(PersonServiceFault.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                case "update": {
                    System.out.println("Enter id:");
                    id = in.nextLong();

                    System.out.println("Enter brand:");
                    brand = in.nextLine();brand = in.nextLine();

                    System.out.println("Enter model:");
                    model = in.nextLine();

                    System.out.println("Enter color: ");
                    color = in.nextLine();

                    System.out.println("Enter fueltank: ");
                    fueltank = in.nextLine();

                    System.out.println("Enter weight: ");
                    weight = in.nextLine();
                    try {
                        message = motorbikeService.getMotorbikeWebServicePort().update(id, brand, model, color, fueltank, weight);
                        System.out.println(message);
                        break;
                    }catch (IllegalNameException ex){
                        Logger.getLogger(PersonServiceFault.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }

            System.out.println("Do you want to change the database?(yes/no)");
            answer = in.nextLine();
        }


    }
}
