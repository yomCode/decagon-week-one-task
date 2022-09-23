import enums.ProductCategory;
import enums.Role;
import enums.Sex;
import models.Personel;
import models.Products;
import models.Staff;
import models.Store;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Instances of Store-------------------------------------------------------------------------------------------------->
        Store ugoMiniStore = new Store(22,"Ugo Mini Store");

        //Instances of a staff Class------------------------------------------------------------------------------------------->
        Staff manager = new Staff( 12,"Hakeem Adewale", Sex.MALE, "Adewale@gmail.com", Role.MANAGER);
        Staff cashier1 = new Staff (323, "Adeola Johnson", Sex.FEMALE, "Adeola123@gmail.com", Role.CASHIER);
        Staff cashier2 = new Staff(324, "Alex Austin", Sex.MALE, "alex123@gmail.com", Role.CASHIER);

        //Instances of a product class------------------------------------------------------------------------------------------>
        Products milo = new Products(01, "Milo", ProductCategory.BEVERAGES, 150.50);
        Products battery = new Products(02, "Battery", ProductCategory.ACCESSORIES, 80.0);
        Products spoon = new Products(03, "Spoon", ProductCategory.UTENSILS, 200.0);
        Products tissuePaper = new Products(04, "Tissue Paper", ProductCategory.TOILETRIES, 500.0);

        List<Staff> staffList = new ArrayList<>();
        List<Products> productsList = new ArrayList<>();

        staffList.add(manager);
        staffList.add(cashier1);
        staffList.add(cashier2);

        productsList.add(milo);
        productsList.add(battery);
        productsList.add(spoon);
        productsList.add(tissuePaper);

        ugoMiniStore.setProductsList(productsList);
        ugoMiniStore.setStaffList(staffList);


        System.out.println(manager);



    }
}
