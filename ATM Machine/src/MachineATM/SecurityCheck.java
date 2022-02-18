package MachineATM;

import java.math.BigInteger;
import java.util.Scanner;

public class SecurityCheck {
    public void securityLogin(){
        BigInteger userPin;
        BigInteger checkPIN;
        BigInteger pinUser;
        Scanner input = new Scanner(System.in);
        System.out.print(" Enter PIN ID to register: ");
        pinUser = input.nextBigInteger();

        userPin = pinUser;
        System.out.print(" Log in on your PIN ID to proceed: ");
        checkPIN = input.nextBigInteger();

        if(checkPIN.equals(userPin)){
            System.out.println(" Matching PIN .... ");
            System.out.println(" PIN Matched .. ");
            System.out.println(" Successfully Log in ");
        }else{
            System.out.println(" Wrong PIN ..");
            System.out.println(" System Exiting ... ");
            System.exit(0);
        }
    }

}
