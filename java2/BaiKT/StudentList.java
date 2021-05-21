package BaiKT;

import java.util.ArrayList;
import java.sql.*;

public class StudentList {
    private ArrayList<Student> myStudents;
    public StudentList() {
        this.myStudents = new ArrayList<Student>();
    }

    private int findStudent(String studentID){
        for (int i =0; i < this.myStudents.size(); i++){
            Student student = this.myStudents.get(i);
            if (student.getStudentID().equals(studentID)){
                return i;
            }
        }
        return -1;
    }

    public boolean addNewStudent(Student student){
        if(findStudent(student.getStudentID()) >= 0){
            System.out.println("Student is already on list");
            return false;
        }
        myStudents.add(student);
        return true;
    }

    public void printStudent(){
        System.out.println("Student List: ");
        for (int i = 0; i < this.myStudents.size(); i++){
            System.out.println((i + 1) + "." +
                    this.myStudents.get(i).getStudentID() + "->" +
                    this.myStudents.get(i).getName() + "->" +
                    this.myStudents.get(i).getAddress() + "->" +
                    this.myStudents.get(i).getPhone());
        }
    }

    public void save(){
        try(
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/students?",
                        "root", "");
                Statement stmt = conn.createStatement();
        ) {
            String insert1= "insert into students values(?,?,?,?)";
            PreparedStatement pstmt = conn.prepareStatement(insert1);
            int rowsInserted = 0;
            for(int i = 0; i < this.myStudents.size(); i++){
                pstmt.setString(1,this.myStudents.get(i).getStudentID());
                pstmt.setString(2,this.myStudents.get(i).getName());
                pstmt.setString(3,this.myStudents.get(i).getAddress());
                pstmt.setString(4, this.myStudents.get(i).getPhone());
                rowsInserted = pstmt.executeUpdate();
            }
            System.out.println(rowsInserted + " student inserted!");

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
