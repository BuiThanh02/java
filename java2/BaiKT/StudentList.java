package BaiKT;

import java.util.ArrayList;

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
}
