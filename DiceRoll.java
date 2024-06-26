import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class DiceRoll {

    public static List<Integer> VALID_DIE = Arrays.asList(2,3,4,6,8,10,12,20,100);
    // Static method to roll a die with a specified number of sides
    public static int roll(int sides) throws Exception {
        // Initialize array for checking valid dice options
        Exception e = new Exception("Invalid Dice");

        //Check sides is listed as a valid dice
        if (!Arrays.asList(validDice).contains(sides)) {
            //Invalid dice
            throw e;
        } else {
            Random random = new Random();
            //Randomize dice roll (sides is maximum bound, 1 is minimum)
            return random.nextInt(sides) + 1;
        }
    }

}