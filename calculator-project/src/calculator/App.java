package calculator;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArithmeticCalculator<Double> calculator = new ArithmeticCalculator<>();

        while (true) {
            System.out.print("첫 번째 숫자를 입력하세요 (exit 입력 시 종료): ");
            String input = sc.next();
            if (input.equalsIgnoreCase("exit")) break;
            double num1 = Double.parseDouble(input);

            System.out.print("두 번째 숫자를 입력하세요: ");
            double num2 = sc.nextDouble();

            System.out.print("연산 기호를 입력하세요 (+, -, *, /): ");
            char op = sc.next().charAt(0);

            try {
                OperatorType operator = OperatorType.fromChar(op);
                double result = calculator.calculate(num1, num2, operator);
                System.out.println("결과: " + result);

                System.out.print("임계값을 입력하세요 (이 값보다 큰 결과 출력): ");
                double threshold = sc.nextDouble();
                calculator.printResultsGreaterThan(threshold);

                // 추가 기능 실행
                calculator.printResultsLessThan(threshold);
                calculator.removeResult();

            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println("계산기를 종료합니다.");
    }
}
