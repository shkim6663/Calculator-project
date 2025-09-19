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

            System.out.print("사칙연산 기호를 입력하세요 (+, -, *, /): ");
            char operatorChar = sc.next().charAt(0);
            OperatorType operator = OperatorType.fromChar(operatorChar);

            double result = calculator.calculate(num1, num2, operator);
            if (!Double.isNaN(result)) {
                System.out.println("결과: " + result);
            }

            System.out.println("저장된 결과 목록: " + calculator.getResults());

            System.out.print("가장 오래된 결과를 삭제하시겠습니까? (y/n): ");
            String remove = sc.next();
            if (remove.equalsIgnoreCase("y")) {
                calculator.removeResult();
            }

            System.out.print("특정 값보다 큰/작은 결과를 조회하시겠습니까? (y/n): ");
            String search = sc.next();
            if (search.equalsIgnoreCase("y")) {
                System.out.print("조회 조건을 선택하세요 (greater/less): ");
                String condition = sc.next();

                System.out.print("기준 값을 입력하세요: ");
                double value = sc.nextDouble();

                if (condition.equalsIgnoreCase("greater")) {
                    System.out.println("조회 결과(큰 값): " + calculator.findResultsGreaterThan(value));
                } else if (condition.equalsIgnoreCase("less"))
                    System.out.println("조회 결과(작은 값): " + calculator.findResultsLessThan(value));
                else {
                    System.out.println("잘못된 조건을 입력했습니다.");
                }

                System.out.println("계산기를 종료합니다.");
            }
        }
    }
}
