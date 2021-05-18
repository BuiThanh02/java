package GiftShop.GiftController;

import GiftShop.GiftModel.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class GiftController {
    List<Gift> BookList = new ArrayList<>();

    public List<Gift> loading() {
        try (
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookshop?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root", "");
                Statement stmt = conn.createStatement();
        ) {
            String select = "Select * from books";
            ResultSet rset = stmt.executeQuery(select);
            while (rset.next()) {
                int id = rset.getInt("id");
                String title = rset.getString("title");
                String author = rset.getString("author");
                double price = rset.getDouble("price");
                int qty = rset.getInt("qty");

                Gift obj = new Gift(id, title, author, price,qty);
                BookList.add(obj);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return BookList;
    }

    public boolean insertBook(Gift gift) {
        try (
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookshop?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root", "");
                Statement stmt = conn.createStatement();
        ) {
            String insert = "Insert into books(id,title,author,price,qty) values(" + gift.getId() + ",'" + gift.getBname() + "','" + gift.getAname() + "'," + gift.getPrice() + "," + gift.getQty() + ")";
            stmt.executeUpdate(insert);
            loading();
            System.out.println("Book has been inserted");
            return true;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }

    public int updateBook(Gift gift, int newId) {
        try (
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookshop?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root", "");
                Statement stmt = conn.createStatement();
        ) {
            String update = "update books set ID=" + gift.getId() + ", title= '" + gift.getBname() + "', author= '" + gift.getAname() + "', price= " + gift.getPrice() + ", qty=" + gift.getQty() + "where id= " + newId;
            int count = stmt.executeUpdate(update);
            loading();
            if (count == 0) {
                return 0;
            } else {
                return 1;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            return -1;
        }
    }

    public boolean deleteBook(int id) {
        try (
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookshop?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root", "");
                Statement stmt = conn.createStatement();
        ) {
            String select = "select * from books where id =" + id;
            ResultSet rset = stmt.executeQuery(select);
            if (!rset.next()) {
                String delete = "delete from books where id =" + id;
                stmt.executeUpdate(delete);
                loading();
                System.out.println("Book has been deleted");
                return true;
            } else
                System.out.println("Cannot delete/No book found");
            return false;
        } catch (SQLException ex) {
            System.out.println("Cannot delete this book");
            ex.printStackTrace();
            return false;
        }
    }

    public void displayBook() {
        try (
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookshop?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root", "");
                Statement stmt = conn.createStatement();
        ) {
            String stt = "Select * from books";
            ResultSet rset = stmt.executeQuery(stt);
            ResultSetMetaData rsetMD = rset.getMetaData();
            int numColums = rsetMD.getColumnCount();
            for (int i = 1; i <= numColums; i++) {
                System.out.printf("%-30s", rsetMD.getColumnName(i));
            }
            loading();
            System.out.println();
            while (rset.next()) {
                for (int i = 1; i <= numColums; i++) {
                    System.out.printf("%-30s", rset.getString(i));
                }
                System.out.println();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
