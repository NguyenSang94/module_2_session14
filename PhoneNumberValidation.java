package session14_Gioi2;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class PhoneNumberValidation {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập các số điện thoại (cách nhau bằng dấu phẩy): ");
        String input = scanner.nextLine();
        String[] phones = input.split(",");
        ArrayList<String> validPhones = new ArrayList<>();
        Map<String, String> invalidPhones = new LinkedHashMap<>();

        for (String phone : phones) {
            phone = phone.trim();

            try {
                InvalidPhoneNumberLengthException.validatePhoneNumber(phone);
                validPhones.add(phone);
            } catch (InvalidPhoneNumberLengthException e) {
                invalidPhones.put(phone, e.getMessage());
            }
        }
        System.out.println("\nSố điện thoại hợp lệ:");
        for (String phone : validPhones) {
            System.out.println("- " + phone);
        }
        System.out.println("\nSố điện thoại không hợp lệ:");
        for (Map.Entry<String, String> entry : invalidPhones.entrySet()) {
            System.out.println("- " + entry.getKey() + " : " + entry.getValue());
        }
        scanner.close();
    }
}
