import ItemPackage.Item;
import Service.ItemCommandService;
import Service.ItemCommandServiceImpl;
import Service.ItemQueryService;
import Service.ItemQueryServiceImpl;

public class Main {
    public static void main(String[] args) {

        ItemCommandServiceImpl itemCommandService =new ItemCommandServiceImpl();
        Item item = new Item();
        ItemQueryServiceImpl itemQueryService = new ItemQueryServiceImpl();

        itemCommandService.addItem(item.getId_guid(), "Konstanty");
        System.out.println(itemQueryService.getItem(item.getId_guid()));
  }
}
