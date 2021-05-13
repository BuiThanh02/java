package Java204;

import java.sql.*;

public class Ex1 {
    public static void main(String[] args) {
        try (
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/ebookshop?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root", "");
                Statement stmt = conn.createStatement()
        ) {
            String strSelect = "select * from books";

            ResultSet rset = stmt.executeQuery(strSelect);

            System.out.println("The records selected are: " + strSelect);
            int rowCount = 0;
            while(rset.next()) {
                String id = rset.getString("id");
                String title = rset.getString("title");
                String author = rset.getString("author");
                double price = rset.getDouble("price");
                int    qty   = rset.getInt("qty");
                System.out.println(id + ", " + title + ", " + author + ", " + price + ", " + qty);
                ++rowCount;
            }
            System.out.println("Total number of records = " + rowCount);

            String strSelect2 = "select title, price from books where author = 'CodeLean VN'";
            ResultSet rset2 = stmt.executeQuery(strSelect2);
            System.out.println("\nThe records selected are: " + strSelect2);
            int rowCount2 = 0;
            while(rset2.next()) {
                String title = rset2.getString("title");
                double price = rset2.getDouble("price");
                System.out.println(title + ", " + price);
                ++rowCount2;
            }
            System.out.println("Total number of records = " + rowCount2);

            String strSelect3 = "select title, author, price, qty from books where author = 'CodeLean VN' or price >= 30 order by price desc, id asc";
            ResultSet rset3 = stmt.executeQuery(strSelect3);
            System.out.println("\nThe records selected are: " + strSelect3);
            int rowCount3 = 0;
            while (rset3.next()){
                String title = rset3.getString("title");
                String author = rset3.getString("author");
                double price = rset3.getDouble("price");
                int qty = rset3.getInt("qty");
                System.out.println(title + ", " + author + ", " + price + ", " + qty);
                ++rowCount3;
            }
            System.out.println("Total number of records = " + rowCount3);

        } catch(SQLException ex) {
            ex.printStackTrace();
        }
    }
}
