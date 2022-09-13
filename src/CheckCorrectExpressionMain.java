import Classes.ExpressionChecker;

import java.io.IOException;

public class CheckCorrectExpressionMain {
    public static void main(String[] args) throws IOException {
        ExpressionChecker eChecker = new ExpressionChecker();

        char[] chExpression = eChecker.getExpressionToCharArray();
        eChecker.expressionCheck(chExpression);
    }
}
