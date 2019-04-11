package sda.java_pro1.i008_calculator;

public class CalculatorApp {

    public static void main(String[] args) {

        PostFixMethod postFixMethod = new PostFixMethod();
        BracketCheck bracketCheck = new BracketCheck();
        String result = null;

        String testText = "( -4 + 4 ) * 2 * ( 3 + 5 )";

        if (bracketCheck.validBracket(testText)) {
            result = postFixMethod.changeToPostFix(testText);
            System.out.println(result);

        } else {
            System.out.println("Bracket error!");
        }

        CalculatorMethod calculatorMethod = new CalculatorMethod();

        System.out.println(calculatorMethod.calculate(result));



    }


}
