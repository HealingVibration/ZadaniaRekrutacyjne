package Service;

import ItemPackage.Item;

import java.util.UUID;

public interface ItemQueryService {

    public Item getItem(UUID id_guid);
}
