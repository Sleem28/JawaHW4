package Classes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExpressionChecker {

    public char[] getExpressionToCharArray() throws IOException {
        System.out.println("Введите выражение для анализа валидности.");
        System.out.println("Выражение может содержать следующие символы:\n();{};<>;[]");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        return reader.readLine().toCharArray();
    }

    public void expressionCheck(char[] chExpression) {
        int[] brackets = new int[4]; // 0:(); 1:{}; 2:<>; 3:[]
        boolean isValid = true;

        for (char element : chExpression) {
            switch (element) {
                case ('(') -> {brackets[0]++;}
                case (')') -> {brackets[0]--;}

                case ('{') -> {brackets[1]++;}
                case ('}') -> {brackets[1]--;}

                case ('<') -> {brackets[2]++;}
                case ('>') -> {brackets[2]--;}

                case ('[') -> {brackets[3]++;}
                case (']') -> {brackets[3]--;}
                default -> {}
            }
            for (int elem : brackets) { // Проверка на корректность скобок. Если первая закрывающая то выходим.
                if (elem < 0) {
                    isValid = false;
                    break;
                }
            }
        }

        for (int element : brackets) {
            if (element != 0) {
                isValid = false;
                break;
            }
        }
        System.out.println(isValid ? "Выражение валидно" : "Выражение не валидно");
    }
}
