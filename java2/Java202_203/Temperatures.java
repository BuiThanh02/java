package Java202_203;

import java.util.Scanner;

public class Temperatures {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap so ngay kiem tra nhiet do");
        int n = scan.nextInt();
        int[] temp = new int[n];
        int sum = 0;
        int count = 0;

        for (int i = 0; i < temp.length; i++){
            System.out.println("Nhap nhiet do cua ngay " + (i+1) + ": ");
            temp[i] = scan.nextInt();
        }

        for (int i = 0; i < temp.length; i++){
            System.out.println("Nhiet do cua ngay " + (i+1) + " la: " + temp[i]);
            sum = sum + temp[i];
        }

        System.out.println("Nhiet do trung binh cua cac ngay la: " + sum/ temp.length);
        
        for (int i = 0; i < temp.length; i++){
            if(temp[i] >= sum/ temp.length){
                count++;
            }
        }
        System.out.println("So ngay nhiet do lon hon trung binh la: " + count);
    }
}
