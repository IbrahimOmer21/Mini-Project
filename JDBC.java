import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JDBC{
    public static void inserter(String ownerName, int ownerID, int carVIN, String carBrand, int carMiles, int price){

        String url = "jdbc:mysql://localhost:3306/carsDB";
        String username="root";
        String password="Ibra.2910";

        try{
            Connection connection = DriverManager.getConnection(url,username,password);
            Statement s=connection.createStatement();
            s.executeUpdate("INSERT INTO `ownertable`(OwnerName,OwnerID) VALUES ('"+ ownerName +"','"+ ownerID +"')");
            Statement s1= connection.createStatement();
            s1.executeUpdate("INSERT INTO `cars`(CarVIN,Model,NumMiles,Price,OwnerID) VALUES ('"+carVIN+"', '"+carBrand+"', '"+carMiles+"', '"+price+"', '"+ownerID+"')");

            connection.close();
        }
        catch (SQLException e) {
            System.out.println(e);
        }
    }

    public static List<String[]> requester(){

        String url = "jdbc:mysql://localhost:3306/carsDB";
        String username="root";
        String password="Ibra.2910";
        List<String[]> carsData = new ArrayList<>();

        try{
            Connection connection = DriverManager.getConnection(url,username,password);
            Statement s=connection.createStatement();
            ResultSet rs = s.executeQuery("select * from cars");

            while (rs.next()){
                String carVIN = rs.getString("CarVIN");
                String carModel = rs.getString("Model");
                String carMiles = rs.getString("NumMiles");
                String pricePD = rs.getString("Price");
                String ownerID = rs.getString("OwnerID");

                carsData.add(new String[]{carVIN, carModel, carMiles, pricePD, ownerID});
            }
            connection.close();
        }
        catch (SQLException e) {
            System.out.println(e);
        }
        return carsData;
    }

}