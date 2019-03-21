import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
public class PostgreSQLDAO {
    public List<Motorbike> getBikes() {
        List<Motorbike> bikes = new ArrayList<>();
        try (Connection connection = ConnectionUtil.getConnection()){
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("select * from motorbikes");
            while (rs.next()) {
                Long id = rs.getLong("id");
                String brand = rs.getString("brand");
                String model = rs.getString("model");
                String color = rs.getString("color");
                String fueltank= rs.getString("fueltank");
                String weight = rs.getString("weight");

                Motorbike bike = new Motorbike(id, brand, model, color, fueltank, weight);
                bikes.add(bike);
            }
        } catch (SQLException ex) {
            Logger.getLogger(PostgreSQLDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return bikes;
    }

    public List<Motorbike> getFind(long id, String brand, String model, String color, String fueltank, String weight ) {
        List<Motorbike> bikes = new ArrayList<>();
        ArrayList<String> particles = new ArrayList<>();
        int q=0;
        try (Connection connection = ConnectionUtil.getConnection()) {
            Statement stmt = connection.createStatement();

            String request= "Select * from motorbikes where ";
            request = createQuery(q, id,request,brand,model,color,fueltank,weight);
            request+= ';';
            ResultSet rs = stmt.executeQuery(request);
            while (rs.next()) {
                id = rs.getLong("id");
                brand = rs.getString("brand");
                model = rs.getString("model");
                color = rs.getString("color");
                fueltank= rs.getString("fueltank");
                weight = rs.getString("weight");

                Motorbike bike = new Motorbike(id, brand, model, color, fueltank, weight);
                bikes.add(bike);
            }
        } catch (SQLException ex) {
            Logger.getLogger(PostgreSQLDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return bikes;
    }

    public String createQuery( int q, long id, String beginRequest,String brand, String model, String color, String fueltank, String weight){
        ArrayList<String> particles = new ArrayList<>();
        particles.add("id="+id);
        if(brand.trim().length()!=0){particles.add("brand='"+brand+"'");}
        if(model.trim().length()!=0){particles.add("model='"+model+"'");}
        if(color.trim().length()!=0){particles.add("color='"+color+"'");}
        if(fueltank.trim().length()!=0){particles.add("fueltank='"+fueltank+"'");}
        if(weight.trim().length()!=0){particles.add("weight='"+weight+"'");}
        String finalRequest="";
        if (q>0) {
            finalRequest = beginRequest + particles.get(0);
            for (int i = 1; i < particles.size(); i++) {
                finalRequest += " , " + particles.get(i);
            }
        }
        else{
           finalRequest = beginRequest + particles.get(0);
           for (int i = 1; i < particles.size(); i++) {
                finalRequest += " and " + particles.get(i);
            }
        }

        return finalRequest;
    }

    public long create(String brand, String model, String color, String fueltank, String weight){
        long newId=-1;
        try (Connection connection = ConnectionUtil.getConnection()){
            Statement stmt = connection.createStatement();
            String request= "INSERT INTO motorbikes(brand, model, color, fueltank, weight) VALUES ('"+brand+"', '"+
                            model+"', '"+ color+"', '"+fueltank+"', '"+weight+"')";
            request += ';';
            int rs1 = stmt.executeUpdate(request);
            Statement stmt1=connection.createStatement();

            ResultSet rs= stmt1.executeQuery("select currval('\"persons_id_seq\"');");
            rs.next();
            newId= rs.getLong("currval");
        } catch (SQLException ex) {
            Logger.getLogger(PostgreSQLDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return newId;
    }

    public String delete(long id) {
        String message="";
        try (Connection connection = ConnectionUtil.getConnection()) {
            Statement stmt = connection.createStatement();
            String request= "DELETE FROM motorbikes WHERE id="+id+';';
            int rs1 = stmt.executeUpdate(request);
            if (rs1>0) message ="Deleted successfully";
                    else message="Error";

        }catch (SQLException ex) {
        Logger.getLogger(PostgreSQLDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return message;
    }



    public String update(long id, String brand, String model, String color, String fueltank, String weight){
        String message="";
        int q =1;
        try (Connection connection = ConnectionUtil.getConnection()) {
            Statement stmt = connection.createStatement();
            String request= "UPDATE motorbikes SET ";
            request =createQuery(q,id,request,brand,model,color,fueltank,weight);
            request+=" WHERE id="+id+";";
            System.out.println(request);
            int rs1 = stmt.executeUpdate(request);
            if (rs1>0) message ="Updated successfully";
            else message="Error";
        }catch (SQLException ex) {
            Logger.getLogger(PostgreSQLDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return message;
    }

}