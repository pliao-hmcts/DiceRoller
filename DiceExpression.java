import java.util.Arrays;
import java.util.List;

public class DiceExpression {
    private String expression;
    int number, dice, modifier, result, finalResult;

    public DiceExpression(String expression) {

        result = 0;
        this.expression = expression.trim(); // Trim the input string
        String[] expressionArr = expression.split("d");
        if (expression.startsWith("d")){
            this.number = 1;
            this.dice = Integer.valueOf(expressionArr[0]);
        } else {
            this.number = Integer.valueOf(expressionArr[0]);
            this.dice = Integer.valueOf(expressionArr[1]);
        }
    }

    public void evaluate() {
        finalResult = 0;
        for (int i = 0; i < number; i++){
            try {
                result = DiceRoll.roll(dice);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            System.out.println("Roll " + (i + 1) + ": " + result);
            finalResult += result;
        }

    }
}