package session14_Kha2;

import java.util.ArrayList;
import java.util.Scanner;

public class session14_kha2 {

     static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> validNumbers = new ArrayList<>();
        int invalidCount = 0;

        System.out.print("Nhập số lượng chuỗi: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 1; i <= n; i++) {
            System.out.print("Nhập chuỗi thứ " + i + ": ");
            String input = scanner.nextLine();

            try {
                int number = Integer.parseInt(input);
                validNumbers.add(number);
            } catch (NumberFormatException e) {
                invalidCount++;
            }
        }

        // Kết quả
        System.out.println("\nSố chuỗi hợp lệ: " + validNumbers.size());
        System.out.println("Số chuỗi không hợp lệ: " + invalidCount);
        System.out.println("Danh sách số nguyên hợp lệ: " + validNumbers);

        scanner.close();
    }
}
