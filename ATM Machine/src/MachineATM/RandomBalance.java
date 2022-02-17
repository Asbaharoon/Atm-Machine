package MachineATM;
import java.util.Arrays;
import java.util.Random;

public class RandomBalance {
        public void randomBalance(){
            long [] userBalance = {10000, 20000, 30000, 40000, 50000,
            60000, 70000, 80000, 90000};
            Random randomBalance = new Random();
            long balanceRandom = randomBalance.nextLong(userBalance.length);
            System.out.println(Arrays.toString(userBalance));
        }
}
