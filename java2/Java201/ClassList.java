package Java201;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ClassList {

    public static void main(String[] args) {
        List<String> students = new ArrayList<>();

        students.add("Tran Van Duong");
        students.add("Bui Huu Thanh");
        students.add("Nguyen Hoang Anh");
        students.add("Duong Quoc Viet");
        students.add("Pham Thanh Dat");
        students.add("Luong Minh Tien");
        students.add("Le Dinh Cuong");
        students.add("Nguyen Viet Anh");
        students.add("Vu Hoang Ngoc Anh");

        System.out.println("Danh sach hoc sinh cua lop" + students);

        students.set(4,"Dat Smoke");

        System.out.println("Danh sach sau khi doi ten: " + students);

        students.remove(4);

        System.out.println("Danh sach sau khi duoi hoc sinh: " + students);

        System.out.println("Danh sach hoc sinh cua lop: ");
        students.forEach(s -> {
            System.out.println(s);
        });

        System.out.println("\nDanh sach hoc sinh cua lop: ");
        Iterator<String> studentsIterator = students.iterator();
        while (studentsIterator.hasNext()) {
            String s = studentsIterator.next();
            System.out.println(s);
        }

        System.out.println("\nDanh sach hoc sinh cua lop: ");
        ListIterator<String> studentsListIterator = students.listIterator(students.size());
        while (studentsListIterator.hasPrevious()) {
            String s = studentsListIterator.previous();
            System.out.println(s);
        }

        System.out.println("\nDanh sach hoc sinh cua lop: ");
        for(String s: students){
            System.out.println(s);
        }

        System.out.println("\nDanh sach hoc sinh cua lop: ");
        for (int i = 0; i < students.size(); i++){
            System.out.println(students.get(i));
        }
    }
}
