package BaiKT;

public class Student {
    private String studentID;
    private String name;
    private String address;
    private String phone;

    public Student(String studentID, String name, String address, String phone) {
        this.studentID = studentID;
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getStudentID() {
        return studentID;
    }

    public String getAddress() {
        return address;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public static Student createNewStudent(String studentID, String name, String address, String phone){
        return new Student(studentID, name, address, phone);
    }
}
