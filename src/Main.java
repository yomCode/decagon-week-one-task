import enums.ProductCategory;
import enums.Qualification;
import enums.Role;
import enums.Sex;
import models.*;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        //Instances of Store-------------------------------------------------------------------------------------------------->
        Store ugoMiniStore = new Store(22,"Ugo Mini Store");

        //Instances of a staff Class------------------------------------------------------------------------------------------->
        Staff manager = new Staff( 12,"Hakeem Adewale", 45, Sex.MALE, Qualification.MSC, "Adewale@gmail.com", Role.MANAGER);
        Staff cashier1 = new Staff ( 323, "Adeola Johnson", 20, Sex.FEMALE, Qualification.BSC, "Adeola123@gmail.com", Role.CASHIER);
        Staff cashier2 = new Staff(324, "Alex Austin",23, Sex.MALE, Qualification.HND, "alex123@gmail.com", Role.CASHIER);

        //Instances of a product class------------------------------------------------------------------------------------------>
//        Products product1 = new Products(01, "Milo", ProductCategory.BEVERAGES, 150.50);
//        Products product2 = new Products(02, "Battery", ProductCategory.ACCESSORIES, 80.0);
//        Products product3 = new Products(03, "Spoon", ProductCategory.UTENSILS, 200.0);
//        Products product4 = new Products(04, "Tissue Paper", ProductCategory.TOILETRIES, 500.0);

         Products product1 = new Products(01, "Milo", ProductCategory.BEVERAGES, 150.0, 10);


        //Instances of a Customer Class------------------------------------------------------------------------------------------------->
        Customer customer1 = new Customer(01, 1300.00,  product1);

        Applicant applicant1 = new Applicant(2332, "Ronke George", 26, Sex.FEMALE, Qualification.HND,
                "rony123@gmail.com", 86.0, 3);



        Applicant applicant2 = new Applicant(2322, "John Banks", 25, Sex.MALE, Qualification.BSC,
                "john123@gmail.com", 83.5, 3);







//        Customer newprint = new PrintReceiptService(customer1.getProductId(), customer1.getProductName(), customer1.getCategory(), customer1.getRatePerUnit(), customer1.getQuantity(),
//                customer1.getCashPaid());

        List<Staff> staffList = new ArrayList<>();
        List<Products> productsList = new ArrayList<>();


        staffList.add(manager);
        staffList.add(cashier1);
        staffList.add(cashier2);

        productsList.add(product1);
//        productsList.add(product2);
//        productsList.add(product3);
//        productsList.add(product4);

        ugoMiniStore.setProductsList(productsList);
        ugoMiniStore.setStaffList(staffList);



//        System.out.println(customer1.buyProduct());
//        System.out.println(applicant1.takeExam());
//        System.out.println(manager.hireCashier(manager, applicant1));
//        System.out.println(cashier1.sellProduct(cashier1, customer1));
//        System.out.println(PrintReceipt.printReceipt(cashier1, customer1));
//        System.out.println(ugoMiniStore);
//        System.out.println(cashier1.printReceipt(cashier1, customer1));

//        ArrayList<String> products = new ArrayList<>();
//        String path = "/Users/decagon/Desktop/ProductList.csv";
//        String line = "";
//        try{
//            BufferedReader read = new BufferedReader(new FileReader(path));
//
//            while((line = read.readLine()) != null){
//                String[] value = line.split("");
//                products.add(line);
//            }
//        } catch(FileNotFoundException e){
//            e.printStackTrace();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

//        System.out.println(products);

//        System.out.println(cashier1.sellProduct(cashier1, customer1));
//        System.out.println(product1.getQuantity());
    }
}
