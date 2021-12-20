package Service;

import ItemPackage.Item;

import java.sql.*;
import java.util.UUID;

public class ItemQueryServiceImpl implements ItemQueryService{

    @Override
    public Item getItem(UUID id_guid) {
        Item item;

        try {
            Connection con = DriverManager.getConnection(
                    "jdbc:h2:myDatabase", "sa",
                    "");

        Statement stmt = con.createStatement();

        ResultSet rs = stmt.executeQuery("Select * from item where id_guid = id_guid");

        while (rs.next()) {
            String name = rs.getString("id_guid");
            System.out.println(name);
        }
        }catch (SQLException jse){

        }
        return null;
    }


}
