import java.util.*;

public class Atm {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int password = 1020;
        int user_input_pin;
        int counter = 0;
        do{
            System.out.println("WELCOME TO MEEZAN BANK");
            System.out.println("Enter your PIN");
            user_input_pin = scn.nextInt();

            if (user_input_pin == password) {
                System.out.println("01: Check Balance");
                System.out.println("02: Withdraw Balance");
                System.out.println("03: Transfer Balance");
                break;
            } else if (user_input_pin != password) {
                System.out.println("INVALID PASSWORD");
                counter++; 
            } 
            if (counter == 3) {
                System.out.println("Too many wrong attempts. Exiting...");
                System.exit(0);
            
            }            
        }while(true);
    }
}
