import enums.ProductCategory;
import enums.Qualification;
import enums.Sex;
import models.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        //Instances of Store-------------------------------------------------------------------------------------------------->
        Store ugoMiniStore = new Store(22,"Ugo Mini Store");

        //Instances of a staff Class------------------------------------------------------------------------------------------->
        Manager manager = new Manager( 12,"Hakeem Adewale", 45, Sex.MALE, Qualification.MSC, "Adewale@gmail.com");
        Cashier cashier1 = new Cashier ( 323, "Adeola Johnson", 20, Sex.FEMALE, Qualification.BSC, "Adeola123@gmail.com");
        Cashier cashier2 = new Cashier(324, "Alex Austin",23, Sex.MALE, Qualification.HND, "alex123@gmail.com");

        //Instances of a product class------------------------------------------------------------------------------------------>
        Products product1 = new Products(01, "Milo", ProductCategory.BEVERAGES, 150.50);
        Products product2 = new Products(02, "Battery", ProductCategory.ACCESSORIES, 80.0);
        Products product3 = new Products(03, "Spoon", ProductCategory.UTENSILS, 200.0);
        Products product4 = new Products(04, "Tissue Paper", ProductCategory.TOILETRIES, 500.0);

        //Instances of a Customer Class------------------------------------------------------------------------------------------------->
        Customer customer1 = new Customer(01, "MILO", ProductCategory.BEVERAGES, 150.0,
                10, 1600.0);

        Applicant applicant1 = new Applicant(2332, "Ronke George", 26, Sex.FEMALE, "rony123@gmail.com",
                Qualification.HND, 3);

        applicant1.setExamScore(86.0);

        Applicant applicant2 = new Applicant(2322, "John Banks", 25, Sex.MALE, "john123@gmail.com",
                Qualification.HND, 3);

        applicant2.setExamScore(85.5);



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



//        System.out.println(customer1.buyProduct());
        System.out.println(applicant1.takeExam());
        System.out.println(manager.hireCashier(applicant1));
//        System.out.println(cashier1.sellProduct(customer1));
//        System.out.println(PrintReceipt.printReceipt(cashier1, customer1));



    }
}
