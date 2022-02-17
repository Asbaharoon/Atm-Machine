package MachineATM;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    static int options = 0;
    static int balance = 0;
    static int withdraw = 0;
    static int deposit = 0;
    static String transferPerson = "";
    static String userFirstName = "";
    static String userLastName = "";
    static BigInteger userID = BigInteger.valueOf(0);
    static BigInteger pinID = BigInteger.valueOf(0);

    public static void main (String[]args){
        Scanner input = new Scanner(System.in);
        var security = new SecurityCheck();
        var select = new Options();
        var randomBal = new RandomBalance();
        new RegisterAccount(userFirstName, userLastName, userID);
        
        security.securityLogin();

        select.selectOptions();
        select.Atm_Options();
        options = input.nextInt();

        switch (options){
            case 1:
                System.out.println(" ");
                break;

            case 2:
                System.out.println(" adasd ");
                break;


            case 3:
                System.out.println();
                break;


            case 4:
                System.out.println();
                break;


            case 5:
                System.out.println();
                break;


            case 6:
                System.out.println();
                break;

            default:
                System.out.println(" ");
        }
    }
}
