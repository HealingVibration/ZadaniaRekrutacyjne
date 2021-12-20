package ItemPackage;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Item {

    String name;
    UUID id_guid = UUID.randomUUID();


    public Item(String name){
        this.name = name;
    }
}
