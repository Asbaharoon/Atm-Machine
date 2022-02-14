package MachineATM;


import java.math.BigInteger;

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

}
