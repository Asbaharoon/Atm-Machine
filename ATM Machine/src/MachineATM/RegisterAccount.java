package MachineATM;

import java.math.BigInteger;
import java.util.Scanner;

public class RegisterAccount {
    private String firstName;
    private String lastName;
    private BigInteger userID;


    RegisterAccount(String firstName, String lastName, BigInteger userID){
        this.firstName = firstName;
        this.lastName = lastName;
        this.userID = userID;


        userData(firstName, lastName, userID);

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


    public void userData(String firstN, String lastN, BigInteger userID){
        Scanner gatherData = new Scanner(System.in);

        System.out.print(" Enter your Firstname: ");
        firstN = gatherData.nextLine();

        System.out.print(" Enter your Lastname: ");
        lastN = gatherData.nextLine();

        System.out.print(" Enter your userID: ");
        userID = gatherData.nextBigInteger();


        System.out.println();

        System.out.println(" Data Printing ... ");
        System.out.println(" Firstname: " + firstN);
        System.out.println(" Lastname: " + lastN);
        System.out.println(" UserID: " + userID);

        System.out.println(" Account Successfully Registered ..");
        try {
           if(firstN.length() <= 1 || lastN.length() <= 1){
           throw new Exception();
           }
        }catch (Exception e){
            System.out.println(" System is Exiting ..");
            System.out.println(" Details are not Valid");
            System.out.println(" Proper Details is a must .. ");
        }
    }


}
