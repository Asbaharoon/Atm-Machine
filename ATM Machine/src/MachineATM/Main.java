package MachineATM;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    static int options;
    static int balance;
    static int withdraw;
    static int deposit;
    static String transferPerson;
    
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);
        String userFirstName = "";
        String userLastName = "";
        BigInteger userID = BigInteger.valueOf(0);
        BigInteger pinID = BigInteger.valueOf(0);
        
        
        var select = new Options();
        var userRegister = new RegisterAccount(userFirstName, userLastName, userID, pinID);
        select.selectOptions();
        select.Atm_Options();
        options = input.nextInt();
        
        switch (options){
            case 1:
                System.out.println();
                break;
                
            default:
                System.out.println(" ");
        }
    }
}
