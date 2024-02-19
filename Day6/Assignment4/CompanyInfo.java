package Day6.Assignment4;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class CompanyInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the desired locale (en or ja): ");
        String localeStr = scanner.nextLine();

        Locale locale;
        if (localeStr.equalsIgnoreCase("en")) {
            locale = new Locale("en", "US");
        } else if (localeStr.equalsIgnoreCase("ja")) {
            locale = new Locale("ja", "JP");
        } else {
            System.out.println("Invalid locale. Defaulting to English.");
            locale = new Locale("en", "US");
        }

        ResourceBundle messages = ResourceBundle.getBundle("message_en", locale);

        System.out.println(messages.getString("company.name") + ": " + messages.getString("company.name.value"));
        System.out.println(messages.getString("company.headoffice.address") + ": " + messages.getString("company.headoffice.address.value"));
        System.out.println(messages.getString("company.branch.address") + ": " + messages.getString("company.branch.address.value"));

        scanner.close();
    }
}
