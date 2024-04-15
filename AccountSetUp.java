import java.util.Scanner;
public class AccountSetUp
{
    public static void main(String[]args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a username: ");
        String username = input.nextLine();
        username = username.toLowerCase();
        System.out.print("Enter a password that is at least 8 characters: ");
        String password = input.nextLine();
        password = password.toLowerCase();
        if (password.length() < 8){
            password = input.nextLine();
            System.out.print("Enter a password that is at least 8 characters: ");
            System.out.print("Your username is " + username + " and your password is " + password);
        }
        System.out.print("Your username is " + username + " and your password is " + password);
    }
}