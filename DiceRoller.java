public class DiceRoller {
    public static void main(String[] args) {
        // Placeholder for user input handling
        String userInput = "1d100";//args[0]; // Example input
        DiceExpression expression = new DiceExpression(userInput);
        expression.evaluate();
    }
}
