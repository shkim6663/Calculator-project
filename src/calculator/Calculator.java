package calculator;

import java.util.ArrayList;
import java.util.List;

public abstract class Calculator {
    private List<Double> results = new ArrayList<>();

    public double calculate(double num1, double num2, char operator) {
        double result = 0;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                    return Double.NaN;
                }
                result = num1 / num2;
                break;
            default:
                System.out.println("올바른 연산자를 입력하세요.");
                return Double.NaN;
        }

        results.add(result);
        return result;
    }

    public abstract double calculate(Number a, Number b, OperatorType operator);

    public List<Double> getResults() {
        return new ArrayList<>(results); // 캡슐화
    }

    public void removeResult() {
        if (!results.isEmpty()) {
            results.remove(0);
            System.out.println("가장 먼저 저장된 결과가 삭제되었습니다.");
        } else {
            System.out.println("삭제할 결과가 없습니다.");
        }
    }
}
