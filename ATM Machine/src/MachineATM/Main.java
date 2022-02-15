package MachineATM;

import java.math.BigInteger;
import java.util.Scanner;
public class Main {
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
    }
}
