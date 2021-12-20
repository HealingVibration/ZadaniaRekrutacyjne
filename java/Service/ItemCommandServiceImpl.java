package Service;

import java.sql.*;
import java.util.UUID;

public class ItemCommandServiceImpl implements ItemCommandService{


    @Override
    public void addItem(UUID id_guid, String name) {

        try {
            Connection con = DriverManager.getConnection(
                    "jdbc:myDriver:myDatabase",
                    "sa",
                    "");

            Statement stmt = con.createStatement();
            stmt.execute("CREATE TABLE table1 (id INT PRIMARY KEY)");
            ResultSet rs = stmt.executeQuery(
                    "INSERT INTO item (ID_GUID, NAME) values (id_guid, name)");
        }catch (SQLException jse){

        }
    }
}
