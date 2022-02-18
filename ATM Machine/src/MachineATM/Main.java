package MachineATM;

import java.math.BigInteger;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class Main {
    static int options = 0;
    static int balance = 0;
    static int withdraw = 0;
    static int deposit = 0;
    static int transferPersonID = 0;
    static int personMoneyTransfer = 0;
    static String userFirstName = "";
    static String userLastName = "";
    static BigInteger userID = BigInteger.valueOf(0);
    static BigInteger pinID = BigInteger.valueOf(0);
    public static void main (String[]args) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        Scanner input = new Scanner(System.in);
        var security = new SecurityCheck();
        var select = new Options();
        var randomBal = new RandomBalance();
        new RegisterAccount(userFirstName, userLastName, userID);
        security.securityLogin();
        balance = Integer.parseInt(randomBal.randomBalance());
        do {
        select.Atm_Options();
        select.selectOptions();
        options = input.nextInt();

            switch (options) {
                case 1:
                    System.out.println("Balance: $" + balance);
                    break;

                case 2:
                    System.out.print(" Enter amount to deposit: ");
                    deposit = input.nextInt();
                    balance = balance + deposit;
                    System.out.println(" Total Balance: $" + balance);
                    break;

                case 3:
                    System.out.print(" Enter amount to withdraw: ");
                    withdraw = input.nextInt();
                    if(withdraw > balance){
                        System.out.println(" Insufficient Balance ");
                    }else{
                        balance = balance - withdraw;
                        System.out.println(" Balance: $" + balance);
                    }
                    break;


                case 4:
                    System.out.println(" Transferring money to another account number");
                    System.out.print(" Enter the account number of the person: ");
                    transferPersonID = input.nextInt();
                    System.out.print(" Enter amount: $");
                    personMoneyTransfer = input.nextInt();
                    if(personMoneyTransfer > balance){
                        System.out.println(" Insufficient Balance");
                    }else{
                        balance = balance - personMoneyTransfer;
                        System.out.println(" Transaction Successfully done.");
                        System.out.println(" Account number: "+transferPersonID + " received a total amount of: $" +personMoneyTransfer);
                        System.out.println(" Date: "+ dtf.format(now));
                    }
                    break;


                case 5:
                    System.out.println();
                    break;


                case 6:
                    System.out.println(" System Closing ...");
                    System.out.println(" Thank you and have a nice day !");
                    break;

                default:
                    System.out.println(" Chosen option is not included ");
                    break;
            }
        }while(options != 6);
        System.out.println(" Exit ");
    }
}
