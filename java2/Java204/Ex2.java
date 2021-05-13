package Java204;

import java.sql.*;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try(
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/northwind?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                "root", "");
                Statement stmt = conn.createStatement()
        ){
            // cau 1
            String strSelect = "select ContactName from customers";
            ResultSet rset = stmt.executeQuery(strSelect);
            System.out.println("\nThe records selected are: " + strSelect);
            int rowCount = 0;
            while(rset.next()) {
                String ContactName = rset.getString("ContactName");
                System.out.println(ContactName);
                ++rowCount;
            }
            System.out.println("Total number of records = " + rowCount);

            // cau 2
            System.out.println("Enter customer name: ");
            String name = scan.nextLine();
            String strSelect2 = "select * from customers where ContactName = '" + name + "'";
            ResultSet rset2 = stmt.executeQuery(strSelect2);
            System.out.println("\nThe records selected are: " + strSelect2);
            int rowCount2 = 0;
            while(rset2.next()) {
                String Address = rset2.getString("Address");
                String City = rset2.getString("City");
                String CompanyName = rset2.getString("CompanyName");
                String ContactName = rset2.getString("ContactName");
                String ContactTitle = rset2.getString("ContactTitle");
                String Country = rset2.getString("Country");
                String CustomerID = rset2.getString("CustomerID");
                String Fax = rset2.getString("Fax");
                String Phone = rset2.getString("Phone");
                String PostalCode = rset2.getString("PostalCode");
                String Region = rset2.getString("Region");
                System.out.println(Address + ", " + City + ", " + CompanyName + ", "
                + ContactName + ", " + ContactTitle + ", " + Country + ", " + CustomerID
                + ", " + Fax + ", " + Phone + ", " + PostalCode + ", " + Region);
                ++rowCount2;
            }
            System.out.println("Total number of records = " + rowCount2);

            // cau 3
            String strSelect3 = "Select ProductName from products";
            ResultSet rset3 = stmt.executeQuery(strSelect3);
            System.out.println("Products list: ");
            int rowCount3 = 0;
            while(rset3.next()){
                String ProductName = rset3.getString("ProductName");
                rowCount3++;
                System.out.println(ProductName);
            }
            System.out.println("Total number of records: " + rowCount3);

            // cau 4
            System.out.println("Enter product price (x -> y): ");
            double price1 = scan.nextDouble();
            double price2 = scan.nextDouble();
            String strSelect4 = "select ProductName from products where UnitPrice <='" + price2 + "' and UnitPrice >='" + price1 + "'.";
            ResultSet rset4 = stmt.executeQuery(strSelect4);
            int rowCount4 = 0;
            System.out.println("Products list: ");
            while (rset4.next()){
                String ProductName = rset4.getString("ProductName");
                rowCount4++;
                System.out.println(ProductName);
            }
            System.out.println("Total number of records: " + rowCount4);

            // cau 5
            

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
