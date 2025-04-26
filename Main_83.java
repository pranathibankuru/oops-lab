import java.util.Scanner;

interface Login {
    boolean authenticate(String username, String password);
}
class LoginSystem implements Login {
    private final String validUsername = "admin";
    private final String validPassword = "1234";

    public boolean authenticate(String username, String password) {
        return username.equals(validUsername) && password.equals(validPassword);
    }
}
public class Main_83{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Login login = new LoginSystem();

        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        if (login.authenticate(username, password)) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Login failed. Invalid credentials.");
        }

        scanner.close();
          System.out.println("B.Pranathi");
        System.out.println("AV.SC.U4CSE24022");
        System.out.println("CSE-A");
    }
}