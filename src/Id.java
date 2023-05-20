import java.util.Scanner;

public class Id {

    Scanner sc = new Scanner(System.in);
    String username = "amnaniz1";
    String B = "1b3";

    void id() {
        System.out.println("enter username:");
        String str = sc.nextLine();
        if (username.equalsIgnoreCase(str)) {
            System.out.println("username is correct");
        } else {
            System.out.println("username is incorrect");
        }
    }



        void password () {
            System.out.println("enter a password:");
            String str1 = sc.nextLine();
            if (B.equalsIgnoreCase(str1)) {
                System.out.println("password matched");
            } else {
                System.out.println("passwoed is incorrect");
            }
        }


    }






