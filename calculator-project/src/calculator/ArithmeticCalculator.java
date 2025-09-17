package calculator;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ArithmeticCalculator<T extends Number> {
    private final List<Double> results = new ArrayList<>();

    // 계산 수행
    public double calculate(T a, T b, OperatorType operator) {
        double num1 = a.doubleValue();
        double num2 = b.doubleValue();
        double result = operator.apply(num1, num2);
        results.add(result);
        return result;
    }

    // 저장된 전체 결과 반환
    public List<Double> getResults() {
        return results;
    }

    // 람다 & 스트림: 특정 값보다 큰 결과 출력
    public void printResultsGreaterThan(double threshold) {
        List<Double> filtered = results.stream()
                .filter(r -> r > threshold)
                .collect(Collectors.toList());

        System.out.println("저장된 결과 중 " + threshold + " 보다 큰 값: " + filtered);
    }

    // (추가 기능) 특정 값보다 작은 결과 출력
    public void printResultsLessThan(double threshold) {
        List<Double> filtered = results.stream()
                .filter(r -> r < threshold)
                .collect(Collectors.toList());

        System.out.println("저장된 결과 중 " + threshold + " 보다 작은 값: " + filtered);
    }

    // (추가 기능) 결과 전체 평균 출력
    public void printAverage() {
        double avg = results.stream()
                .mapToDouble(Double::doubleValue)
                .average()
                .orElse(Double.NaN);

        System.out.println("저장된 결과들의 평균: " + avg);
    }
}
