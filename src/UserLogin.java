import java.util.Scanner;

public class UserLogin {

    public static void main(String[] args) {

        // Program to check username and password
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your username: ");
        String Username = scan.nextLine();
        System.out.print("Enter password: ");
        String password = scan.nextLine();
		

        /* If the password is incorrect, ask the user if they want to reset their password,
           if the user wants to reset the new password, the new password was entered incorrectly and forgotten
           check that the password should not be the same as the password, and if the passwords are the same,
           display "Password could not be created, please enter another password." If no problem,
           "Password created" Write the program that writes.*/
        if(Username.equals("patika") && password.equals("bootcamp"))
        {
            System.out.println("Entry successful");
        }
        else if(!(Username.equals("patika")) && !(password.equals("bootcamp")))
        {
            System.out.println("Username and password are incorrect, try again!");
        }
        else if(!(Username.equals("patika")) && (password.equals("bootcamp")))
        {
            System.out.println("Username wrong, try again!");
        }
        else
        {
            System.out.println("The password is wrong, do you want to reset it? ");
            String cevap = scan.nextLine();
        if(cevap.equals("Yes"))
        {
            System.out.println("Enter your new password: ");
            String yeniSifre = scan.nextLine();

        if(!yeniSifre.equals(password))
        {
             System.out.println("Password generated.");
        }
        else
        {
            System.out.println("Do not enter your old or incorrect password! Failed to create password.");
        }
        }
        else
        {
            System.out.println("Password reset has been canceled.");
            }
        }

    }

}