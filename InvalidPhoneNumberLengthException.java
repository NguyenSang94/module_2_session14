package session14_Gioi2;

public class InvalidPhoneNumberLengthException extends Exception {

    public InvalidPhoneNumberLengthException(String message) {
        super(message);
    }
    public static void validatePhoneNumber(String phone)
            throws InvalidPhoneNumberLengthException {
        if (phone.contains(" ")) {
            throw new InvalidPhoneNumberLengthException("Không được chứa khoảng trắng");
        }
        if (!phone.matches("\\d+")) {
            throw new InvalidPhoneNumberLengthException("Chứa ký tự không hợp lệ");
        }
        if (phone.length() != 10) {
            throw new InvalidPhoneNumberLengthException("Sai độ dài (phải đúng 10 chữ số)");
        }
    }
}
