package Java202_203;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap so phan tu nguyen cua mang.");
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++){
            System.out.println("Nhap phan tu " + (i+1) + " : ");
            arr[i] = scan.nextInt();
        }

        System.out.println("Cac phan tu trong mang la: ");
        for (int j : arr) {
            System.out.println(j);
        }

        System.out.println("Trung binh cac so trong mang la: " + getAverage(arr));
    }

    public static double getAverage(int[] arr){
        int sum = 0;
        for (int j : arr) {
            sum = sum + j;
        }

        return sum / arr.length;
    }
}
