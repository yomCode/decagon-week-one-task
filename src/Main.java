import Services.CashierService;
import Services.CustomerService;
import Services.PrintReceiptService;
import enums.ProductCategory;
import enums.Role;
import enums.Sex;
import models.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        //Instances of Store-------------------------------------------------------------------------------------------------->
        Store ugoMiniStore = new Store(22,"Ugo Mini Store");

        //Instances of a staff Class------------------------------------------------------------------------------------------->
        Staff manager = new Staff( 12,"Hakeem Adewale", 45, Sex.MALE, "Adewale@gmail.com", Role.MANAGER);
        Staff cashier1 = new Staff ( 323, "Adeola Johnson", 20, Sex.FEMALE, "Adeola123@gmail.com", Role.CASHIER);
        Staff cashier2 = new Staff(324, "Alex Austin",23, Sex.MALE, "alex123@gmail.com", Role.CASHIER);

        //Instances of a product class------------------------------------------------------------------------------------------>
        Products product1 = new Products(01, "Milo", ProductCategory.BEVERAGES, 150.50);
        Products product2 = new Products(02, "Battery", ProductCategory.ACCESSORIES, 80.0);
        Products product3 = new Products(03, "Spoon", ProductCategory.UTENSILS, 200.0);
        Products product4 = new Products(04, "Tissue Paper", ProductCategory.TOILETRIES, 500.0);

        //Instances of a Customer Class------------------------------------------------------------------------------------------------->
        Customer customer1 = new Customer(01, "MILO", ProductCategory.BEVERAGES, 150.0,
                10, 1700.0);


//        Customer newprint = new PrintReceiptService(customer1.getProductId(), customer1.getProductName(), customer1.getCategory(), customer1.getRatePerUnit(), customer1.getQuantity(),
//                customer1.getCashPaid());

        List<Staff> staffList = new ArrayList<>();
        List<Products> productsList = new ArrayList<>();


        staffList.add(manager);
        staffList.add(cashier1);
        staffList.add(cashier2);

        productsList.add(product1);
        productsList.add(product2);
        productsList.add(product3);
        productsList.add(product4);

        ugoMiniStore.setProductsList(productsList);
        ugoMiniStore.setStaffList(staffList);



        System.out.println(customer1.buyProduct());
        System.out.println(manager.hireCashier(manager));
        System.out.println(cashier1.sellProduct(cashier1, customer1));
        System.out.println(PrintReceiptService.printReceipt(cashier1, customer1));



    }
}
