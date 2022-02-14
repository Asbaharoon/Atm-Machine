package MachineATM;


import javax.management.RuntimeErrorException;
import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

public class RegisterAccount {
    private String firstName;
    private String lastName;
    private BigInteger userID;
    private BigInteger pinID;

    RegisterAccount(String firstName, String lastName, BigInteger userID, BigInteger pinID){
        this.firstName = firstName;
        this.lastName = lastName;
        this.userID = userID;
        this.pinID = pinID;

        userData(firstName, lastName, userID, pinID);

    }


    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getFirstName(){
        return firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public String getLastName(){
        return lastName;
    }

    public void setUserID(BigInteger userID){
        this.userID = userID;
    }

    public BigInteger getUserID(){
        return userID;
    }

    public void setPinID(BigInteger pinID){
        this.pinID = pinID;
    }

    public BigInteger getPinID(){
        return pinID;
    }

    public void userData(String firstN, String lastN, BigInteger userID, BigInteger pinID){
        Scanner gatherData = new Scanner(System.in);
    
        System.out.print(" Enter your Firstname: ");
        firstN = gatherData.nextLine();

        System.out.print(" Enter your Lastname: ");
        lastN = gatherData.nextLine();

        System.out.print(" Enter your userID: ");
        userID = gatherData.nextBigInteger();

        System.out.print(" Enter your pinID: ");
        pinID = gatherData.nextBigInteger();

        System.out.println();

        System.out.println(" Data Printing ... ");
        System.out.println(" Firstname: " + firstN);
        System.out.println(" Lastname: " + lastN);
        System.out.println(" UserID: " + userID);
        System.out.println(" PinID: " + pinID);

        try {
           if(firstN.length() <= 1 || lastN.length() <= 1){
           throw new Exception();
           }
        }catch (Exception e){
            System.out.println(" You need to refill up again Maam/Sir: " + firstN + " " + lastN);
            System.out.println(" Proper Details is a must .. ");
        }
    }


}
