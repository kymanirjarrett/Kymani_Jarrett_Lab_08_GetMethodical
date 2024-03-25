import java.util.Scanner;

public class Reggie
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String ssnPattern = "^\\d{3}-\\d{2}-\\d{4}$";
        String ssnInput = SafeInput.getRegExString(scanner, "Enter your Social Security Number (e.g., 123-45-6789)", ssnPattern);
        System.out.println("Your Social Security Number is: " + ssnInput);

        String mNumberPattern = "^(M|m)\\d{5}$";
        String mNumberInput = SafeInput.getRegExString(scanner, "Enter your UC Student M Number (e.g., M12345)", mNumberPattern);
        System.out.println("The UC Student ID you entered is: " + mNumberInput);

        String menuChoicePattern = "^[OoSsVvQq]$";
        String menuChoiceInput = SafeInput.getRegExString(scanner, "Choose a menu option (O/S/V/Q):", menuChoicePattern);
        System.out.println("Menu choice: " + menuChoiceInput);
    }
}