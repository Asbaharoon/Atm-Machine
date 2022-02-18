package MachineATM;

public class Options implements UserAction {
    public void Atm_Options(){
        System.out.println(" 1. Balance ");
        System.out.println(" 2. Deposit ");
        System.out.println(" 3. Withdraw ");
        System.out.println(" 4. Transfer Money ");
        System.out.println(" 5. Recover Account ");
        System.out.println(" 6. Exit ");
    }

    @Override
    public void selectOptions(){
        System.out.print(" Select your Options: ");
    }
}
