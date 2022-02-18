package MachineATM;
import java.util.Random;

public class RandomBalance {
        public String randomBalance(){
            Random randomBalance = new Random();
            String [] userBalance = {"10000", "20000", "30000", "40000", "50000",
            "60000", "70000", "80000", "90000"};
            int balanceRandom = 0;
            balanceRandom = randomBalance.nextInt(userBalance.length);
                System.out.println(" Random Balance has been Generated ... ");
                System.out.println(" Balance: $" + userBalance[balanceRandom]);
            return userBalance[balanceRandom];

        }
}
